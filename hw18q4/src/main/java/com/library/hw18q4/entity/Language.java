package com.library.hw18q4.entity;

public enum Language {
    ENGLISH(1),
    CHINESE(2),
    SPANISH(3),
    ARABIC(4),
    FARSI(5),
    FRENCH(6),
    RUSSIAN(7);

    private Integer num;

    Language(Integer num) {
    }

    public static Language getLanguage(Integer num) {
        return switch (num) {
            case 1 -> ENGLISH;
            case 2 -> CHINESE;
            case 3 -> SPANISH;
            case 4 -> ARABIC;
            case 5 -> FARSI;
            case 6 -> FRENCH;
            case 7 -> RUSSIAN;
            default -> null;
        };
    }
}
