package pl.wkos.homework162;

public enum Suits {
    CLUBS("żołądź", "clubs"),
    DIAMONDS("dzwonek", "diamonds"),
    HEARTS("serce", "hearts"),
    SPADES("wino", "spades");
    private final String plSuit;
    private final String enSuit;

    Suits(String plSuit, String enSuit) {
        this.plSuit = plSuit;
        this.enSuit = enSuit;
    }

    public String getSuit(String language) {
        if (Languages.isInLanguages(language)) {
            switch (language) {
                case "PL":
                    return plSuit;
                case "EN":
                    return enSuit;
            }
        }
        return plSuit;
    }
}
