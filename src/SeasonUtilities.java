import java.util.Scanner;

public class SeasonUtilities {
    public static void printSeasonAndMonths(Season season) {
        System.out.println(season);
        System.out.println(getSeasonMonths(season));
    }

    public static Season getSeasonFromConsole() {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        for (Season item : Season.values())
            if (item.getDescription().equals(season))
                return item;
        throw new IllegalArgumentException("Nie ma takiej pory roku");
    }

    public static SeasonMonths getSeasonMonths(Season season) {
        for (SeasonMonths item : SeasonMonths.values())
            if (item.name().equals(season.name())) return item;
        throw new IllegalArgumentException("Nie ma takiej pory roku");
    }
}

