package com.github.zipcodewilmington.utils;

import java.util.*;

public class DeckCards {

    private List<Card> deck;

    public DeckCards(){
        this.deck = new ArrayList<Card>();
        generateDeck();
    }

    public Card draw() {
        if(this.deck.isEmpty()) {
            return null;
        } else{
            Card drawCard = this.deck.get(0);
            this.deck.remove(drawCard);
            return drawCard;
        }
    }

    public void shuffle() {
        Collections.shuffle(this.deck);
    }

    public boolean remove(Card card) {
        for(Card c : this.deck){
            if(c.getSuit() == card.getSuit() && c.getRank() == card.getRank()){
                this.deck.remove(c);
                return true;
            }
        }
        return false;

    }

    public void generateDeck() {
        Suit[] suits = Suit.values();
        Rank[] ranks = Rank.values();
        for(Rank rank : ranks){
            for(Suit suit : suits){
                this.deck.add(new Card(rank, suit));
            }
        }

    }

    public List<Card> getDeck(){
        return this.deck;
    }

    public boolean containsCard(Card card) {
        for(Card c : this.deck){
            if(c.getSuit() == card.getSuit() && c.getRank() == card.getRank()){
                return true;
            }
        }
        return false;
    }

//    public Card pop() {
//        return this.pop();
//    }
}