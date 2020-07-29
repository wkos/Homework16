package pl.wkos.homework162;

public enum Languages {
    PL("polski"),
    EN("angielski");

    private final String description;

    Languages(String description) {
        this.description = description;
    }

    public static boolean isInLanguages(String language) {
        for (Languages item : Languages.values())
            if (item.name().equals(language)) return true;
        return false;
    }
}
