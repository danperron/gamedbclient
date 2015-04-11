/*
 * The MIT License
 *
 * Copyright 2015 Dan Perron <danp3rr0n@gmail.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.danperron.gamesdbclient.impl;

import com.danperron.gamedbclient.domain.GetArtResponse;
import com.danperron.gamedbclient.domain.GetGameResponse;
import com.danperron.gamedbclient.domain.GetGamesListResponse;
import com.danperron.gamedbclient.domain.GetPlatformGamesResponse;
import com.danperron.gamedbclient.domain.GetPlatformResponse;
import com.danperron.gamedbclient.domain.GetPlatformsListResponse;
import com.danperron.gamesdbclient.GamesDBClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;
import com.google.common.base.Strings;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import javax.management.RuntimeErrorException;
import javax.xml.bind.JAXBException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 *
 * @author Dan Perron <danp3rr0n@gmail.com>
 */
public class GameDBClientImpl implements GamesDBClient {

    private final Executor executor = Executors.newCachedThreadPool();
    private final CloseableHttpClient httpClient = HttpClients.createDefault();
    private final ObjectMapper objectMapper;

    public GameDBClientImpl() {

        objectMapper = new XmlMapper();
        objectMapper.setAnnotationIntrospector(new JaxbAnnotationIntrospector());
        objectMapper.registerModule(new JaxbAnnotationModule());
    }

    @Override
    public Future<GetGamesListResponse> searchGames(final String query) {
        return searchGames(null, query, null);
    }

    @Override
    public Future<GetGamesListResponse> searchGames(final Long id, final String query) {
        return searchGames(id, query, null);
    }

    @Override
    public Future<GetGamesListResponse> searchGames(final String query, final Platform platform) {
        return searchGames(null, query, platform);
    }

    @Override
    public Future<GetGamesListResponse> searchGames(final Long id, final String query, final Platform platform) {
        final FutureTask<GetGamesListResponse> futureTask;
        futureTask = new FutureTask<>(new Callable<GetGamesListResponse>() {
            @Override
            public GetGamesListResponse call() throws Exception {
                final RequestBuilder requestBuilder = RequestBuilder.get("http://thegamesdb.net/api/GetGamesList.php");

                if (id != null) {
                    requestBuilder.addParameter("id", String.valueOf(id));
                }

                if (!Strings.isNullOrEmpty(query)) {
                    requestBuilder.addParameter("name", query);
                }

                if (platform != null) {
                    requestBuilder.addParameter("platform", platform.value());
                }

                final HttpUriRequest request = requestBuilder.build();

                try (CloseableHttpResponse response = httpClient.execute(request)) {
                    final int statusCode = response.getStatusLine().getStatusCode();

                    if (statusCode != HttpStatus.SC_OK) {
                        throw new RuntimeException(String.format("GetGamesList responded with %d status.", statusCode));
                    }

                    return objectMapper.readValue(response.getEntity().getContent(), GetGamesListResponse.class);
                }
            }
        });
        executor.execute(futureTask);
        return futureTask;
    }

    @Override
    public Future<GetGameResponse> getGameById(final Long gameId) {
        final FutureTask<GetGameResponse> futureTask;
        futureTask = new FutureTask<>(new Callable<GetGameResponse>() {
            @Override
            public GetGameResponse call() throws Exception {
                final HttpUriRequest request = RequestBuilder.get("http://thegamesdb.net/api/GetGame.php")
                        .addParameter("id", gameId.toString())
                        .build();

                try (final CloseableHttpResponse response = httpClient.execute(request)) {
                    final int statusCode = response.getStatusLine().getStatusCode();

                    if (statusCode != HttpStatus.SC_OK) {
                        throw new RuntimeException(String.format("GetGame returned with %d status.", statusCode));
                    }
                    return objectMapper.readValue(response.getEntity().getContent(), GetGameResponse.class);
                }
            }
        });
        executor.execute(futureTask);
        return futureTask;
    }

    @Override
    public Future<GetArtResponse> getGameArt(final Long gameId) {
        final FutureTask<GetArtResponse> futureTask;
        futureTask = new FutureTask<>(new Callable<GetArtResponse>() {

            @Override
            public GetArtResponse call() throws Exception {
                final HttpUriRequest request = RequestBuilder
                        .get("http://thegamesdb.net/api/GetArt.php")
                        .addParameter("id", gameId.toString())
                        .build();

                try (final CloseableHttpResponse response = httpClient.execute(request)) {
                    final int statusCode = response.getStatusLine().getStatusCode();

                    if (statusCode != HttpStatus.SC_OK) {
                        throw new RuntimeException(String.format("GetArt responded with %d status.", statusCode));
                    }

                    return objectMapper.readValue(response.getEntity().getContent(), GetArtResponse.class);
                }
            }
        });
        executor.execute(futureTask);
        return futureTask;
    }

    @Override
    public Future<GetPlatformsListResponse> getPlatformsList() {
        final FutureTask<GetPlatformsListResponse> futureTask;
        futureTask = new FutureTask<>(new Callable<GetPlatformsListResponse>() {

            @Override
            public GetPlatformsListResponse call() throws Exception {
                final HttpUriRequest request = RequestBuilder
                        .get("http://thegamesdb.net/api/GetPlatformsList.php")
                        .build();

                try (final CloseableHttpResponse response = httpClient.execute(request)) {
                    final int statusCode = response.getStatusLine().getStatusCode();

                    if (statusCode != HttpStatus.SC_OK) {
                        throw new RuntimeException(String.format("GetPlatformsList responded with %d status", statusCode));
                    }

                    return objectMapper.readValue(response.getEntity().getContent(), GetPlatformsListResponse.class);
                }
            }
        });
        executor.execute(futureTask);
        return futureTask;
    }

    @Override
    public Future<GetPlatformResponse> getPlatform(final Long platformId) {
        final FutureTask<GetPlatformResponse> futureTask;
        futureTask = new FutureTask<>(new Callable<GetPlatformResponse>() {

            @Override
            public GetPlatformResponse call() throws Exception {
                final HttpUriRequest request = RequestBuilder.get("http://thegamesdb.net/api/GetPlatform.php")
                        .addParameter("id", platformId.toString())
                        .build();

                try (final CloseableHttpResponse response = httpClient.execute(request)) {
                    final int statusCode = response.getStatusLine().getStatusCode();
                    
                    if(statusCode != HttpStatus.SC_OK){
                        throw new RuntimeException(String.format("GetPlatform responded with %d status", statusCode));
                    }
                    
                    return objectMapper.readValue(response.getEntity().getContent(), GetPlatformResponse.class);
                }
            }
        });
        executor.execute(futureTask);
        return futureTask;
    }

    @Override
    public Future<GetPlatformGamesResponse> getPlatformGames(final Long platformId) {
        final FutureTask<GetPlatformGamesResponse> futureTask;
        
        futureTask = new FutureTask<>(new Callable<GetPlatformGamesResponse>() {

            @Override
            public GetPlatformGamesResponse call() throws Exception {
                final HttpUriRequest request = RequestBuilder
                        .get("http://thegamesdb.net/api/GetPlatformGames.php")
                        .addParameter("platform", platformId.toString())
                        .build();
                
                try(final CloseableHttpResponse response = httpClient.execute(request)){
                    final int statusCode = response.getStatusLine().getStatusCode();
                    
                    if(statusCode != HttpStatus.SC_OK){
                        throw new RuntimeException(String.format("GetPlatformGames returned with %d status code.", statusCode));
                    }
                    
                    return objectMapper.readValue(response.getEntity().getContent(), GetPlatformGamesResponse.class);
                }
            }
        });
        
        executor.execute(futureTask);
        return futureTask;
    }

}
