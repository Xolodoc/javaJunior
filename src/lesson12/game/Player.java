package lesson12.game;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand = new ArrayList<>();

    public void addCardToHand(Card card) {
        hand.add(card);

    }

    public void printHand() {
        System.out.println("------Ваши карты:-------");
        for (Card card : hand) {
            System.out.println(card);


        }

    }
}
