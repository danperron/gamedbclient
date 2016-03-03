/*
 *  Copyright 2016, Charter Communications, All rights reserved.
 */
package com.danperron.gamesdbclient;

/**
 *
 * Enum that contains platform names
 * 
 * @author Dan Perron <dperron@kenzan.com>
 */
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

    public String value() {
        return name;
    }
}
