package pl.wkos.homework162;

public enum Numbers {
    TWO("Dwójka", "Two"),
    THREE("Trójka", "Three"),
    FOUR("Czwórka", "Four"),
    FIVE("Piątka", "Five"),
    SIX("Szóstka", "Six"),
    SEVEN("Siódemka", "Seven"),
    EIGHT("Ósemka", "Eight"),
    NINE("Dziewiątka", "Nine"),
    TEN("Dziesiątka", "Ten");

    private final String plNumber;
    private final String enNumber;

    Numbers(String plNumber, String enNumber) {
        this.plNumber = plNumber;
        this.enNumber = enNumber;
    }

    public String getPlNumber() {
        return plNumber;
    }

    public String getEnNumber() {
        return enNumber;
    }

    public static boolean isInNumbers(String number) {
        for (Numbers n : Numbers.values())
            if (n.name().equals(number)) return true;
        return false;
    }
}
