//package com.github.zipcodewilmington.casino.games.BlackJack;
package com.github.zipcodewilmington.utils;

import com.github.zipcodewilmington.utils.Card;
import com.github.zipcodewilmington.utils.Rank;


import java.util.Collections;
import java.util.Stack;

public class BlackJackDeck extends Stack<Card>
{
    //Stack<Card> deck;

    public BlackJackDeck(){
        for(Suit s : Suit.values()){
            for(Rank f : Rank.values()){
                Card c = new Card(f, s);
                this.add(c);
            }
        }
        this.shuffle();
    }

    public Card removeCard()
    {
        return this.pop();
    }

    public void shuffle()
    {
        Collections.shuffle(this);
    }

}
