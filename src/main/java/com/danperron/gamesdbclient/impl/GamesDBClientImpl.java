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

import com.danperron.gamesdbclient.domain.GetArtResponse;
import com.danperron.gamesdbclient.domain.GetGameResponse;
import com.danperron.gamesdbclient.domain.GetGamesListResponse;
import com.danperron.gamesdbclient.domain.GetPlatformGamesResponse;
import com.danperron.gamesdbclient.domain.GetPlatformResponse;
import com.danperron.gamesdbclient.domain.GetPlatformsListResponse;
import com.danperron.gamesdbclient.domain.Platform;
import com.danperron.gamesdbclient.GamesDBClient;
import com.danperron.gamesdbclient.GamesDBClientException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;
import com.google.common.base.Strings;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
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
public class GamesDBClientImpl implements GamesDBClient {

    private final ExecutorService executorService;
    private final CloseableHttpClient httpClient = HttpClients.createDefault();
    private final XmlMapper xmlMapper;

    public GamesDBClientImpl(ExecutorService executorService) {
        xmlMapper = new XmlMapper();
        xmlMapper.setAnnotationIntrospector(new JaxbAnnotationIntrospector());
        xmlMapper.registerModule(new JaxbAnnotationModule());
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        this.executorService = executorService;
    }

    @Override
    public CompletableFuture<GetGamesListResponse> searchGames(final String query) {
        return searchGames(query, null);
    }

    @Override
    public CompletableFuture<GetGamesListResponse> searchGames(final String query, final Platform platform) {

        final CompletableFuture<GetGamesListResponse> result = new CompletableFuture<>();

        CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
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
                        throw new GamesDBClientException(String.format("GetGamesList responded with %d status.", statusCode));
                    }
                    result.complete(xmlMapper.readValue(response.getEntity().getContent(), GetGamesListResponse.class));
                } catch (IOException ex) {
                    result.completeExceptionally(new GamesDBClientException("Error while attempting to search.", ex));
                } catch (GamesDBClientException ex) {
                    result.completeExceptionally(ex);
                }
            }
        }, executorService);
        return result;
    }

    @Override
    public CompletableFuture<GetGameResponse> getGameById(final Long gameId) {

        final CompletableFuture<GetGameResponse> result = new CompletableFuture<>();

        CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                final HttpUriRequest request = RequestBuilder.get("http://thegamesdb.net/api/GetGame.php")
                        .addParameter("id", gameId.toString())
                        .build();

                try (final CloseableHttpResponse response = httpClient.execute(request)) {
                    final int statusCode = response.getStatusLine().getStatusCode();

                    if (statusCode != HttpStatus.SC_OK) {
                        throw new GamesDBClientException(String.format("GetGame returned with %d status.", statusCode));
                    }
                    result.complete(xmlMapper.readValue(response.getEntity().getContent(), GetGameResponse.class));
                } catch (IOException ex) {
                    result.completeExceptionally(new GamesDBClientException("Error attempting to get game by Id.", ex));
                } catch (GamesDBClientException ex) {
                    result.completeExceptionally(ex);
                }
            }
        }, executorService);

        return result;

    }

    @Override
    public CompletableFuture<GetArtResponse> getGameArt(final Long gameId) {

        final CompletableFuture<GetArtResponse> result = new CompletableFuture<>();
        CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                final HttpUriRequest request = RequestBuilder
                        .get("http://thegamesdb.net/api/GetArt.php")
                        .addParameter("id", gameId.toString())
                        .build();

                try (final CloseableHttpResponse response = httpClient.execute(request)) {
                    final int statusCode = response.getStatusLine().getStatusCode();

                    if (statusCode != HttpStatus.SC_OK) {
                        throw new GamesDBClientException(String.format("GetArt responded with %d status.", statusCode));
                    }

                    result.complete(xmlMapper.readValue(response.getEntity().getContent(), GetArtResponse.class));
                } catch (IOException ex) {
                    result.completeExceptionally(new GamesDBClientException("Unable to get Game Art", ex));
                } catch (GamesDBClientException ex) {
                    result.completeExceptionally(ex);
                }
            }
        }, executorService);
        return result;
    }

    @Override
    public CompletableFuture<GetPlatformsListResponse> getPlatformsList() {
        final CompletableFuture<GetPlatformsListResponse> result = new CompletableFuture<>();
        CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                final HttpUriRequest request = RequestBuilder
                        .get("http://thegamesdb.net/api/GetPlatformsList.php")
                        .build();

                try (final CloseableHttpResponse response = httpClient.execute(request)) {
                    final int statusCode = response.getStatusLine().getStatusCode();

                    if (statusCode != HttpStatus.SC_OK) {
                        throw new GamesDBClientException(String.format("GetPlatformsList responded with %d status", statusCode));
                    }

                    result.complete(xmlMapper.readValue(response.getEntity().getContent(), GetPlatformsListResponse.class));
                } catch (IOException ex) {
                    result.completeExceptionally(new GamesDBClientException("Unable to get platform list.", ex));
                } catch (GamesDBClientException ex) {
                    result.completeExceptionally(ex);
                }
            }
        }, executorService);
        return result;

    }

    @Override
    public CompletableFuture<GetPlatformResponse> getPlatform(final Long platformId) {

        final CompletableFuture<GetPlatformResponse> result = new CompletableFuture<>();
        CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                final HttpUriRequest request = RequestBuilder.get("http://thegamesdb.net/api/GetPlatform.php")
                        .addParameter("id", platformId.toString())
                        .build();

                try (final CloseableHttpResponse response = httpClient.execute(request)) {
                    final int statusCode = response.getStatusLine().getStatusCode();

                    if (statusCode != HttpStatus.SC_OK) {
                        throw new GamesDBClientException(String.format("GetPlatform responded with %d status", statusCode));
                    }

                    result.complete(xmlMapper.readValue(response.getEntity().getContent(), GetPlatformResponse.class));
                } catch (IOException ex) {
                    result.completeExceptionally(new GamesDBClientException("Unable to get platform.", ex));
                } catch (GamesDBClientException ex) {
                    result.completeExceptionally(ex);
                }
            }
        }, executorService);
        return result;

    }

    @Override
    public CompletableFuture<GetPlatformGamesResponse> getPlatformGames(final Long platformId) {

        final CompletableFuture<GetPlatformGamesResponse> result = new CompletableFuture<>();
        CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                final HttpUriRequest request = RequestBuilder
                        .get("http://thegamesdb.net/api/GetPlatformGames.php")
                        .addParameter("platform", platformId.toString())
                        .build();

                try (final CloseableHttpResponse response = httpClient.execute(request)) {
                    final int statusCode = response.getStatusLine().getStatusCode();

                    if (statusCode != HttpStatus.SC_OK) {
                        throw new GamesDBClientException(String.format("GetPlatformGames returned with %d status code.", statusCode));
                    }
                    result.complete(xmlMapper.readValue(response.getEntity().getContent(), GetPlatformGamesResponse.class));
                } catch (IOException ex) {
                    result.completeExceptionally(new GamesDBClientException("Unable to get games by platform.", ex));
                } catch (GamesDBClientException ex) {
                    result.completeExceptionally(ex);
                }
            }
        }, executorService);
        return result;
    }

}
