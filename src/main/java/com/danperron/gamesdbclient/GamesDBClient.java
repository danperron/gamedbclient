/*
 * The MIT License
 *
 * Copyright 2015 Dan.
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
package com.danperron.gamesdbclient;

import com.danperron.gamedbclient.domain.GetArtResponse;
import com.danperron.gamedbclient.domain.GetGameResponse;
import com.danperron.gamedbclient.domain.GetGamesListResponse;
import com.danperron.gamedbclient.domain.GetPlatformGamesResponse;
import com.danperron.gamedbclient.domain.GetPlatformResponse;
import com.danperron.gamedbclient.domain.GetPlatformsListResponse;
import java.util.concurrent.Future;

/**
 *
 * @author Dan Perron <danp3rr0n@gmail.com>
 */
public interface GamesDBClient {

    Future<GetGamesListResponse> searchGames(String query);
    Future<GetGamesListResponse> searchGames(Long id, String query);
    Future<GetGamesListResponse> searchGames(String query, Platform platform);
    Future<GetGamesListResponse> searchGames(Long id, String query, Platform platform);

    Future<GetGameResponse> getGameById(Long gameId);

    Future<GetArtResponse> getGameArt(Long gameId);

    Future<GetPlatformsListResponse> getPlatformsList();

    Future<GetPlatformResponse> getPlatform(Long platformId);

    Future<GetPlatformGamesResponse> getPlatformGames(Long platformId);

    public enum Platform {

        NES("Nintendo Entertainment System (NES)"),
        SNES("Super Nintendo (SNES)"),
        WII("Nintendo Wii"),
        GAMECUBE("Nintendo GameCube"),
        GBA("Nintendo Game Boy Advance"),
        PSP("Sony PSP"),
        PSX("Sony Playstation"),
        PS2("Sony Playstation 2"),
        PS3("Sony Playstation 3"),
        PS4("Sony Playstation 4"),
        SEGA_GENESIS("Sega Genesis"),
        ARCADE("Arcade");

        private final String name;

        private Platform(String name) {
            this.name = name;
        }
        
        public String value(){
            return name;
        }
    }

}
