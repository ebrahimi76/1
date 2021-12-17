package com.library.hw18q4.entity;

public enum Genre {
    ROMANCE(1),
    MYSTERY(2),
    FANTASY(3),
    HORROR(4),
    RELIGIOUS(5),
    BIOGRAPHY(6);

    private Integer num;

    Genre(Integer num) {
    }

    public static Genre getGenre(Integer num) {
        return switch (num) {
            case 1 -> ROMANCE;
            case 2 -> MYSTERY;
            case 3 -> FANTASY;
            case 4 -> HORROR;
            case 5 -> RELIGIOUS;
            case 6 -> BIOGRAPHY;
            default -> null;
        };
    }
}
