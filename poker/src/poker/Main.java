package poker;
import java.util.*;

class Card {
    private String face;
    private String suit;

    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }

    public String toString() {
        return face + " of " + suit;
    }
}


class Deck {
    public Deck() {
        String faces[] = {
                "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"
        };

        String suits[] = {
                "Diamonds", "Hearts", "Clubs", "Spades"
        };

        Card[] deck = new Card[52];
        int currentCard = 0;
        Random rng = new Random();

        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card(faces[i % 13], suits[i / 13]);
        }

    }

}

class Engine {

}

public class Main {

    public static void main(String[] args) {



    }
}
