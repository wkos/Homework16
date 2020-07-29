package pl.wkos.homework162;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardUtilities {
    public static List<String> createPackOfCards() {
        List<String> packOfCards = new ArrayList<>();
        for (Suits s : Suits.values()) {
            for (Numbers n : Numbers.values()) {
                packOfCards.add(n.name() + " " + s.name());
            }
            for (Faces f : Faces.values()) {
                packOfCards.add(f.name() + " " + s.name());
            }
        }
        return packOfCards;
    }

    public static String readLanguage() {
        System.out.println("Podaj język");
        Scanner scanner = new Scanner(System.in);
        String languageVersion;
        while (!Languages.isInLanguages((languageVersion = scanner.nextLine()).toUpperCase()));
        return languageVersion.toUpperCase();
    }

    public static void printAllCards(List<String> packOfCards) {
        for (String item : packOfCards)
            System.out.println(item);
    }

    public static List<String> createPackOfCardsInLanguage(String lanugage, List<String> packOfCards) {
        List<String> packOfCardsInLanguage = new ArrayList<>();
        switch (lanugage) {
            case "PL": {
                for (String item : packOfCards) {
                    String[] suitsAndFaces = item.split(" ");
                    String oneCard;
                    if (Numbers.isInNumbers(suitsAndFaces[0]))
                        oneCard = Numbers.valueOf(suitsAndFaces[0]).getPlNumber();
                    else
                        oneCard = Faces.valueOf(suitsAndFaces[0]).getPlFace();
                    oneCard += " " + Suits.valueOf(suitsAndFaces[1]).getPlSuit();
                    packOfCardsInLanguage.add(oneCard);
                }
                break;
            }
            case "EN": {
                for (String item : packOfCards) {
                    String[] suitsAndFaces = item.split(" ");
                    String oneCard;
                    if (Numbers.isInNumbers(suitsAndFaces[0]))
                        oneCard = Numbers.valueOf(suitsAndFaces[0]).getEnNumber();
                    else
                        oneCard = Faces.valueOf(suitsAndFaces[0]).getEnFace();
                    oneCard += " of " + Suits.valueOf(suitsAndFaces[1]).getEnSuit();
                    packOfCardsInLanguage.add(oneCard);
                }
                break;
            }
        }
        return packOfCardsInLanguage;
    }
}
