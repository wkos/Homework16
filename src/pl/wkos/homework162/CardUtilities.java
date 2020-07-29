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
        System.out.println("Podaj język [PL, EN]");
        Scanner scanner = new Scanner(System.in);
        String languageVersion;
        while (!Languages.isInLanguages((languageVersion = scanner.nextLine()).toUpperCase()))
            System.out.println("Niewłaściwy język. Wybierz jeszcze raz [PL, EN]");
        return languageVersion.toUpperCase();
    }

    public static void printAllCards(List<String> packOfCards) {
        for (String item : packOfCards)
            System.out.println(item);
    }

    public static List<String> createPackOfCardsInLanguage(String lanugage, List<String> packOfCards, String preposition) {
        List<String> packOfCardsInLanguage = new ArrayList<>();
        for (String item : packOfCards) {
            String[] suitsAndFaces = item.split(" ");
            String oneCard;
            if (Numbers.isInNumbers(suitsAndFaces[0]))
                oneCard = Numbers.valueOf(suitsAndFaces[0]).getNumber(lanugage);
            else
                oneCard = Faces.valueOf(suitsAndFaces[0]).getFace(lanugage);
            oneCard += preposition + Suits.valueOf(suitsAndFaces[1]).getSuit(lanugage);
            packOfCardsInLanguage.add(oneCard);
        }
        return packOfCardsInLanguage;
    }
}
