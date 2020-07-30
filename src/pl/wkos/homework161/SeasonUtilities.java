package pl.wkos.homework161;

import java.util.Scanner;

public class SeasonUtilities {
    public static void printSeasonAndMonths(Season season) {
        System.out.println(season);
        String[] months = getSeasonMonths(season);
        String listOfMonths = "Miesiące (";
        int numberOfMonths = months.length;
        for (int i = 0; i < numberOfMonths - 1; i++)
            listOfMonths += months[i] + ", ";
        listOfMonths += months[numberOfMonths - 1];
        System.out.println(listOfMonths);
    }

    public static Season getSeasonFromConsole() {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        for (Season item : Season.values())
            if (item.getDescription().equals(season))
                return item;
        throw new IllegalArgumentException("Nie ma takiej pory roku");
    }

    public static String[] getSeasonMonths(Season season) {
        for (Season item : Season.values())
            if (item.name().equals(season.name())) return item.getMonths();
        throw new IllegalArgumentException("Nie ma takiej pory roku");
    }
}

