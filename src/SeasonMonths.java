public enum SeasonMonths {
    SPRING(new String[]{"marzec", "kwiecień", "maj"}),
    SUMMER(new String[]{"czerwiec", "lipiec", "sierpień"}),
    AUTUMN(new String[]{"wrzesień", "październik", "listopad"}),
    WINTER(new String[]{"grudzień", "styczeń", "luty"});

    private final String[] months;

    SeasonMonths(String[] months) {
        this.months = months;
    }

    public String[] getMonths() {
        return months;
    }

    @Override
    public String toString() {
        String buf = "Miesiące (";
        for (int i=0;i<months.length-1;i++)
            buf += months[i] + ", ";
        buf += months[months.length-1] +")";
        return buf;
    }
}
