package ru.mirea.lab4.Seasons;

import ru.mirea.lab4.Seasons.Season;

public class SeasonLove2345 {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        System.out.println(season);
        printAllValues();
        print(Season.AUTUMN);
        print(Season.SPRING);
        print(Season.SUMMER);
        print(Season.WINTER);
    }
    public static void print(Season season) {
        switch (season) {
            case WINTER :
                System.out.println("Я люблю зиму!");
                break;
            case SPRING :
                System.out.println("Я люблю весну!");
                break;
            case SUMMER :
                System.out.println("Я люблю лето!");
                break;
            case AUTUMN :
                System.out.println("Я люблю осень!");
                break;

        }
    }
    public static void printAllValues() {
        for (Season s: Season.values() ) {
            System.out.println(s + " " + s.getAvgTmp() + " "
            + s.getDescription() );
        }
    }
}
