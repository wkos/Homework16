package pl.wkos.homework162;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> packOfCards = CardUtilities.createPackOfCards();
        CardUtilities.printAllCards(packOfCards);
        System.out.println("----------------------------");

        String language = CardUtilities.readLanguage();
        List<String> packOfCardsInLanguage = CardUtilities.createPackOfCardsInLanguage(language, packOfCards);
        CardUtilities.printAllCards(packOfCardsInLanguage);
    }
}
