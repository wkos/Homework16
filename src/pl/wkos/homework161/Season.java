package pl.wkos.homework161;

public enum Season {
    SPRING("wiosna", new String[]{"marzec", "kwiecień", "maj"}),
    SUMMER("lato", new String[]{"czerwiec", "lipiec", "sierpień"}),
    AUTUMN("jesień", new String[]{"wrzesień", "październik", "listopad"}),
    WINTER("zima", new String[]{"grudzień", "styczeń", "luty"});

    private final String description;
    private final String[] months;

    Season(String description, String[] months) {
        this.description = description;
        this.months = months;
    }

    public String getDescription() {
        return description;
    }

    public String[] getMonths() {
        return months;
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
