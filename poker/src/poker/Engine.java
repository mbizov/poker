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
    private String faces[] = { "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace" };
    private String suits[] = { "Diamonds", "Hearts", "Clubs", "Spades" };
    private int DECK_SIZE = 52;
    private int currCard = 0;
    private Random rng = new Random();
    Card deck[];
    
    /* def ctor */
    public Deck() {
        deck = new Card[DECK_SIZE];
        currCard = 0;

        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card(faces[i % 13], suits[i / 13]);
        }
    }
    /* ctor w/ custom size param */
    public Deck(int size) {
        DECK_SIZE = size;
        deck = new Card[DECK_SIZE];
        currCard = 0;

        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card(faces[i % 13], suits[i / 13]);
        }
    }
    
    
    public Card[] Shuffle() {
    
    }

}



public class Engine {
    public Engine(int players) {
        
    }
}
