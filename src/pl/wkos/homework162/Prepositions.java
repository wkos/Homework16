package pl.wkos.homework162;

public enum Prepositions {
    PL(" "),
    EN(" of ");

    public final String descripiton;

    Prepositions(String descripiton) {
        this.descripiton = descripiton;
    }

    public String getDescripiton() {
        return descripiton;
    }
}
