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
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import static org.junit.Assert.*;

/**
 *
 * @author Dan Perron <danp3rr0n@gmail.com>
 */
public class GamesDBClientImplIT {
    
    private ExecutorService executorService;
    
    public GamesDBClientImplIT() {
        executorService = Executors.newSingleThreadExecutor();
    }
    

    /**
     * Test of searchGames method, of class GameDBClientImpl.
     * @throws java.lang.InterruptedException
     * @throws java.util.concurrent.ExecutionException
     */
    @org.junit.Test
    public void testSearchGames() throws InterruptedException, ExecutionException {
        System.out.println("searchGames");
        String query = "bubblebobble";
        GamesDBClientImpl instance = new GamesDBClientImpl(executorService);
        Future<GetGamesListResponse> expResult = null;
        Future<GetGamesListResponse> result = instance.searchGames(query, Platform.NINTENDO_ENTERTAINMENT_SYSTEM_NES);
        GetGamesListResponse gamesListResponse = result.get();
        
        assertNotNull(gamesListResponse);
        assertEquals(7824, gamesListResponse.getGame().get(0).getId());
        assertEquals("Bubble Bobble", gamesListResponse.getGame().get(0).getGameTitle());
        assertEquals("01/01/1990", gamesListResponse.getGame().get(0).getReleaseDate());
        assertEquals(Platform.NINTENDO_ENTERTAINMENT_SYSTEM_NES.value(), gamesListResponse.getGame().get(0).getPlatform());
    }

    /**
     * Test of getGameById method, of class GameDBClientImpl.
     */
    @org.junit.Test
    public void testGetGameById() throws InterruptedException, ExecutionException {
        System.out.println("getGameById");
        Long gameId = 7824l;
        GamesDBClientImpl instance = new GamesDBClientImpl(executorService);
        
        Future<GetGameResponse> result = instance.getGameById(gameId);
        
        GetGameResponse getGameResponse = result.get();
        
        assertNotNull(getGameResponse);
        assertEquals("Bubble Bobble", getGameResponse.getGame().getGameTitle());
        assertEquals(Platform.NINTENDO_ENTERTAINMENT_SYSTEM_NES.value(), getGameResponse.getGame().getPlatform());
    }

    /**
     * Test of getGameArt method, of class GameDBClientImpl.
     */
    @org.junit.Test
    public void testGetGameArt() throws InterruptedException, ExecutionException {
        System.out.println("getGameArt");
        Long gameId = 7824l;
        GamesDBClientImpl instance = new GamesDBClientImpl(executorService);
        Future<GetArtResponse> result = instance.getGameArt(gameId);
        
        GetArtResponse getArtResponse = result.get();
        
        assertEquals("http://thegamesdb.net/banners/",getArtResponse.getBaseImgUrl());
        assertEquals("boxart/original/back/7824-1.jpg", getArtResponse.getImages().getBoxart().get(0).getValue());
        
    }

    /**
     * Test of getPlatformsList method, of class GameDBClientImpl.
     */
    @org.junit.Test
    public void testGetPlatformsList() throws InterruptedException, ExecutionException {
        System.out.println("getPlatformsList");
        GamesDBClientImpl instance = new GamesDBClientImpl(executorService);
        Future<GetPlatformsListResponse> result = instance.getPlatformsList();
        
        GetPlatformsListResponse getPlatformsListResponse = result.get();
        
        assertNotNull(getPlatformsListResponse);
        
        boolean foundNES = false;
        for(GetPlatformsListResponse.Platforms.Platform platform : getPlatformsListResponse.getPlatforms().getPlatform()){
            if(platform.getId() == 7){
                foundNES = true;
                assertEquals("Nintendo Entertainment System (NES)", platform.getName());
                assertEquals("nintendo-entertainment-system-nes", platform.getAlias());
            }
        }
        assertTrue(foundNES);
        
    }

    /**
     * Test of getPlatform method, of class GameDBClientImpl.
     */
    @org.junit.Test
    public void testGetPlatform() throws InterruptedException, ExecutionException {
        System.out.println("getPlatform");
        Long platformId = 7l;
        GamesDBClientImpl instance = new GamesDBClientImpl(executorService);
        Future<GetPlatformResponse> result = instance.getPlatform(platformId);
        
        GetPlatformResponse platformResponse = result.get();
        
        assertNotNull(platformResponse);
        
        assertEquals(7, platformResponse.getPlatform().getId());
        assertEquals("Nintendo Entertainment System (NES)", platformResponse.getPlatform().getPlatform());
    }

    /**
     * Test of getPlatformGames method, of class GameDBClientImpl.
     */
    @org.junit.Test
    public void testGetPlatformGames() throws InterruptedException, ExecutionException {
        System.out.println("getPlatformGames");
        Long platformId = 7l;
        GamesDBClientImpl instance = new GamesDBClientImpl(executorService);
        Future<GetPlatformGamesResponse> result = instance.getPlatformGames(platformId);
        
        GetPlatformGamesResponse getPlatformGamesResponse = result.get();
        assertNotNull(getPlatformGamesResponse);
        assertTrue(getPlatformGamesResponse.getGame().size() > 10);
        
    }
    
}
