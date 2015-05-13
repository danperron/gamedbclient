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
import com.danperron.gamedbclient.domain.Platform;
import com.danperron.gamesdbclient.GamesDBClient;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;
import com.google.common.base.Strings;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.apache.http.HttpStatus;
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

    private final ExecutorService executorService;
    private final CloseableHttpClient httpClient = HttpClients.createDefault();
    private final XmlMapper xmlMapper;

    public GameDBClientImpl(ExecutorService executorService) {
        xmlMapper = new XmlMapper();
        xmlMapper.setAnnotationIntrospector(new JaxbAnnotationIntrospector());
        xmlMapper.registerModule(new JaxbAnnotationModule());
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        
        this.executorService = executorService;
    }

    @Override
    public Future<GetGamesListResponse> searchGames(final String query) {
        return searchGames(query, null);
    }

    @Override
    public Future<GetGamesListResponse> searchGames(final String query, final Platform platform) {

        return executorService.submit(new Callable<GetGamesListResponse>() {
            @Override
            public GetGamesListResponse call() throws Exception {
                final RequestBuilder requestBuilder = RequestBuilder.get("http://thegamesdb.net/api/GetGamesList.php");

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

                    return xmlMapper.readValue(response.getEntity().getContent(), GetGamesListResponse.class);
                }
            }
        });
    }

    @Override

    public Future<GetGameResponse> getGameById(final Long gameId) {
        return executorService.submit(new Callable<GetGameResponse>() {
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
                    return xmlMapper.readValue(response.getEntity().getContent(), GetGameResponse.class);
                }
            }
        });
    }

    @Override
    public Future<GetArtResponse> getGameArt(final Long gameId) {

        return executorService.submit(new Callable<GetArtResponse>() {

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

                    return xmlMapper.readValue(response.getEntity().getContent(), GetArtResponse.class);
                }
            }
        });
    }

    @Override
    public Future<GetPlatformsListResponse> getPlatformsList() {
        return executorService.submit(new Callable<GetPlatformsListResponse>() {
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

                    return xmlMapper.readValue(response.getEntity().getContent(), GetPlatformsListResponse.class);
                }
            }
        });
    }

    @Override
    public Future<GetPlatformResponse> getPlatform(final Long platformId) {

        return executorService.submit(new Callable<GetPlatformResponse>() {
            @Override
            public GetPlatformResponse call() throws Exception {
                final HttpUriRequest request = RequestBuilder.get("http://thegamesdb.net/api/GetPlatform.php")
                        .addParameter("id", platformId.toString())
                        .build();

                try (final CloseableHttpResponse response = httpClient.execute(request)) {
                    final int statusCode = response.getStatusLine().getStatusCode();

                    if (statusCode != HttpStatus.SC_OK) {
                        throw new RuntimeException(String.format("GetPlatform responded with %d status", statusCode));
                    }

                    return xmlMapper.readValue(response.getEntity().getContent(), GetPlatformResponse.class);
                }
            }
        });
    }

    @Override
    public Future<GetPlatformGamesResponse> getPlatformGames(final Long platformId) {

        return executorService.submit(new Callable<GetPlatformGamesResponse>() {

            @Override
            public GetPlatformGamesResponse call() throws Exception {
                final HttpUriRequest request = RequestBuilder
                        .get("http://thegamesdb.net/api/GetPlatformGames.php")
                        .addParameter("platform", platformId.toString())
                        .build();

                try (final CloseableHttpResponse response = httpClient.execute(request)) {
                    final int statusCode = response.getStatusLine().getStatusCode();

                    if (statusCode != HttpStatus.SC_OK) {
                        throw new RuntimeException(String.format("GetPlatformGames returned with %d status code.", statusCode));
                    }

                    return xmlMapper.readValue(response.getEntity().getContent(), GetPlatformGamesResponse.class);
                }
            }
        });
    }

}
