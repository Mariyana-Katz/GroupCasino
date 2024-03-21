package com.github.zipcodewilmington.utils;

import com.github.zipcodewilmington.utils.Rank;
import com.github.zipcodewilmington.utils.Suit;

public class Card {

    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }


    public String toString() {
        return "Card{"+ this.rank.toString() +" "+ this.suit.toString() + '}';
    }

//    public Rank getFaceValue() {
//        return getFaceValue();
//    }

//    public Object getFace() {
//        return this.getFace();
//    }
}
