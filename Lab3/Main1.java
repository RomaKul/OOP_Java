package com.tasks3.carddeck;

public class Deck {

    private static final int DECKSIZE = 36;
    private int decksize = 36;

    Card[] deck = new Card[DECKSIZE];

    public Deck(){
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 9; j++){
                deck[i*9+j] = new Card(Rank.values[j], Suit.values[i]);
            }
        }
    }
    
    public void shuffle() {
        Card temp = new Card(Rank.ACE, Suit.CLUBS);
        for (int i = 0; i < Math.random()*100; i++){
            int randomNumberA = (int) (Math.random() * DECKSIZE);
            int randomNumberB = (int) (Math.random() * DECKSIZE);
            temp = deck[randomNumberA];
            deck[randomNumberA] = deck[randomNumberB];
            deck[randomNumberB] = temp;
        }
    }
    
    public void order() {
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 9; j++){
                deck[i*9+j] = new Card(Rank.values[j], Suit.values[i]);
            }
        }
    }
    
    public boolean hasNext() {
        if (decksize > -1){
            return true;
        }
        else return false;
    }
    
    public Card drawOne() {
        decksize--;
        if (decksize > -1) {
            return deck[decksize];
        }
        else return null;
    }
}