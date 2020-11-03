package lesson12.game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Koloda koloda = new Koloda();

        Player player = new Player();
        Dealer dealer = new Dealer();

        player.addCardToHand(koloda.takeRandomCard());
        player.addCardToHand(koloda.takeRandomCard());
        dealer.addCardToHand(koloda.takeRandomCard());
        dealer.addCardToHand(koloda.takeRandomCard());

        player.printHand();

        System.out.println("Нужна ли ещё одна карта?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equals("да")) {
            player.addCardToHand(koloda.takeRandomCard());
            player.printHand();
        } else {


        }

    }
}
