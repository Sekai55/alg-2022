package ru.bgpu.task.arrays;

public class PlayingCard {

    public static final String[] SUITS_LIST = {
            "Пик", "Бубен", "Черв", "Треф"
    };

    public static final String[] RANK_LIST = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Валет", "Королева", "Король", "Туз"
    };

    public static String card(int suit, int rank) {
        return (RANK_LIST[rank] + " " + SUITS_LIST[suit] + " | ");
    }
}
