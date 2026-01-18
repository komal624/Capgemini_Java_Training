package CoreProgramming.JavaStrings;

import java.util.Scanner;

/*
 * This program creates a deck of cards,
 * shuffles them and distributes to players.
 */
public class Cards {

    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {
            "2","3","4","5","6","7","8","9","10",
            "Jack","Queen","King","Ace"
    };

    public static String[] createDeck() {
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;

        for (String suit : suits)
            for (String rank : ranks)
                deck[index++] = rank + " of " + suit;

        return deck;
    }

    public static void shuffle(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int r = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] deck = createDeck();
        shuffle(deck);

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        int cardsPerPlayer = deck.length / players;
        int index = 0;

        for (int i = 0; i < players; i++) {
            System.out.println("\nPlayer " + (i + 1));
            for (int j = 0; j < cardsPerPlayer; j++) {
                System.out.println(deck[index++]);
            }
        }

        sc.close();
    }
}
