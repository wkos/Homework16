package pl.wkos.homework162;

public enum Faces {
    JACK("Walet", "Jack"),
    QUEEN("Dama", "Queen"),
    KING("Król", "King"),
    ACE("As", "Ace");

    private final String plFace;
    private final String enFace;

    Faces(String plFace, String enFace) {
        this.plFace = plFace;
        this.enFace = enFace;
    }

    public String getPlFace() {
        return plFace;
    }

    public String getEnFace() {
        return enFace;
    }
}
