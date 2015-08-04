package com.danperron.gamesdbclient.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * @author Dan Perron <danp3rr0n@gmail.com>
 */
@XmlType(name = "Platform", namespace = "http://danperron.com/gamesdbclient/domain/game")
@XmlEnum
public enum Platform {

    @XmlEnumValue("3DO")
    THREE_DEE_OH("3DO"),
    @XmlEnumValue("Amiga")
    AMIGA("Amiga"),
    @XmlEnumValue("Amstrad CPC")
    AMSTRAD_CPC("Amstrad CPC"),
    @XmlEnumValue("Arcade")
    ARCADE("Arcade"),
    @XmlEnumValue("Atari 2600")
    ATARI_2600("Atari 2600"),
    @XmlEnumValue("Atari 5200")
    ATARI_5200("Atari 5200"),
    @XmlEnumValue("Atari 7800")
    ATARI_7800("Atari 7800"),
    @XmlEnumValue("Atari Jaguar")
    ATARI_JAGUAR("Atari Jaguar"),
    @XmlEnumValue("Atari Jaguar CD")
    ATARI_JAGUAR_CD("Atari Jaguar CD"),
    @XmlEnumValue("Atari XE")
    ATARI_XE("Atari XE"),
    @XmlEnumValue("Colecovision")
    COLECOVISION("Colecovision"),
    @XmlEnumValue("Commodore 64")
    COMMODORE_64("Commodore 64"),
    @XmlEnumValue("Intellivision")
    INTELLIVISION("Intellivision"),
    @XmlEnumValue("Mac OS")
    MAC_OS("Mac OS"),
    @XmlEnumValue("Microsoft Xbox")
    MICROSOFT_XBOX("Microsoft Xbox"),
    @XmlEnumValue("Microsoft Xbox 360")
    MICROSOFT_XBOX_360("Microsoft Xbox 360"),
    @XmlEnumValue("NeoGeo")
    NEO_GEO("NeoGeo"),
    @XmlEnumValue("Nintendo 3DS")
    NINTENDO_3_DS("Nintendo 3DS"),
    @XmlEnumValue("Nintendo 64")
    NINTENDO_64("Nintendo 64"),
    @XmlEnumValue("Nintendo DS")
    NINTENDO_DS("Nintendo DS"),
    @XmlEnumValue("Nintendo Entertainment System (NES)")
    NINTENDO_ENTERTAINMENT_SYSTEM_NES("Nintendo Entertainment System (NES)"),
    @XmlEnumValue("Nintendo Game Boy")
    NINTENDO_GAME_BOY("Nintendo Game Boy"),
    @XmlEnumValue("Nintendo Game Boy Advance")
    NINTENDO_GAME_BOY_ADVANCE("Nintendo Game Boy Advance"),
    @XmlEnumValue("Nintendo Game Boy Color")
    NINTENDO_GAME_BOY_COLOR("Nintendo Game Boy Color"),
    @XmlEnumValue("Nintendo GameCube")
    NINTENDO_GAME_CUBE("Nintendo GameCube"),
    @XmlEnumValue("Nintendo Wii")
    NINTENDO_WII("Nintendo Wii"),
    @XmlEnumValue("Nintendo Wii U")
    NINTENDO_WII_U("Nintendo Wii U"),
    PC("PC"),
    @XmlEnumValue("Sega 32X")
    SEGA_32_X("Sega 32X"),
    @XmlEnumValue("Sega CD")
    SEGA_CD("Sega CD"),
    @XmlEnumValue("Sega Dreamcast")
    SEGA_DREAMCAST("Sega Dreamcast"),
    @XmlEnumValue("Sega Game Gear")
    SEGA_GAME_GEAR("Sega Game Gear"),
    @XmlEnumValue("Sega Genesis")
    SEGA_GENESIS("Sega Genesis"),
    @XmlEnumValue("Sega Master System")
    SEGA_MASTER_SYSTEM("Sega Master System"),
    @XmlEnumValue("Sega Mega Drive")
    SEGA_MEGA_DRIVE("Sega Mega Drive"),
    @XmlEnumValue("Sega Saturn")
    SEGA_SATURN("Sega Saturn"),
    @XmlEnumValue("Sinclair ZX Spectrum")
    SINCLAIR_ZX_SPECTRUM("Sinclair ZX Spectrum"),
    @XmlEnumValue("Sony Playstation")
    SONY_PLAYSTATION("Sony Playstation"),
    @XmlEnumValue("Sony Playstation 2")
    SONY_PLAYSTATION_2("Sony Playstation 2"),
    @XmlEnumValue("Sony Playstation 3")
    SONY_PLAYSTATION_3("Sony Playstation 3"),
    @XmlEnumValue("Sony Playstation Vita")
    SONY_PLAYSTATION_VITA("Sony Playstation Vita"),
    @XmlEnumValue("Sony PSP")
    SONY_PSP("Sony PSP"),
    @XmlEnumValue("Super Nintendo (SNES)")
    SUPER_NINTENDO_SNES("Super Nintendo (SNES)"),
    @XmlEnumValue("TurboGrafx 16")
    TURBO_GRAFX_16("TurboGrafx 16");
    private final String value;

    Platform(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Platform fromValue(String v) {
        for (Platform c: Platform.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}