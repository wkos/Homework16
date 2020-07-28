package pl.wkos.homework161;

public class Main {

    public static final int NUMBEROFMONTHSINSEASON = 3;

    public static void main(String[] args) {
        Season.printSeasons();
        System.out.println("Wybierz ulubioną porę roku:");
        Season season = null;
        try {
            season = SeasonUtilities.getSeasonFromConsole();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        SeasonUtilities.printSeasonAndMonths(season);

    }


}
