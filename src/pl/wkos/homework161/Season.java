package pl.wkos.homework161;

public enum Season {
//    SPRING("wiosna", new String[]{"marzec", "kwiecień", "maj"}),
//    SUMMER("lato", new String[]{"czerwiec", "lipiec", "sierpień"}),
//    AUTUMN("jesień", new String[]{"wrzesień", "październik", "listopad"}),
//    WINTER("zima", new String[]{"grudzień", "styczeń", "luty"});
//
//    private final String description;
//    private final String[] months;
//
//    pl.wkos.homework161.Season(String description, String[] months) {
//        this.description = description;
//        this.months = months;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public String[] getMonths() {
//        return months;
//    }

    SPRING("wiosna", SeasonMonths.SPRING),
    SUMMER("lato", SeasonMonths.SUMMER),
    AUTUMN("jesień", SeasonMonths.AUTUMN),
    WINTER("zima", SeasonMonths.WINTER);

    private final String description;

    Season(String description, SeasonMonths months) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void printSeasons() {
        System.out.println("Dostępne pory roku");
        for (Season item : Season.values())
            System.out.println(item.getDescription());
    }

    @Override
    public String toString() {
        return "Pora roku{" + description + "(" + name() + ")}";
    }
}
