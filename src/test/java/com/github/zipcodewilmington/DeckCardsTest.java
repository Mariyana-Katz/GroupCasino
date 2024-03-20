package com.github.zipcodewilmington;

import com.github.zipcodewilmington.utils.Card;
import com.github.zipcodewilmington.utils.DeckCards;
import com.github.zipcodewilmington.utils.Rank;
import com.github.zipcodewilmington.utils.Suit;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

public class DeckCardsTest {
    @Test
    public void testConstructor() {

        DeckCards test = new DeckCards();
        Integer deckSize = test.getDeck().size();
        Integer expectedSize = 52;

        Assert.assertEquals(deckSize,expectedSize);
    }
    @Test
    public void DrawTest(){
        DeckCards deck = new DeckCards();
        List<Card> list = deck.getDeck();
        Card expected = list.get(0);
        Integer expectedSize = 51;

        Card actual = deck.draw();
        Integer actualSize = deck.getDeck().size();

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expectedSize, actualSize);
    }
    @Test
    public void removeTest(){
        DeckCards test = new DeckCards();
        Card toRemove = new Card(Rank.ACE, Suit.SPADES);
        test.remove(toRemove);
        List<Card> deck = test.getDeck();
        assertFalse(test.containsCard(toRemove));
    }
    @Test
    public void testShuffle(){
        DeckCards test = new DeckCards();
        List<Card> deckList = test.getDeck();
        test.shuffle();

        List<Card> shuffle = test.getDeck();
        Card[] deck = new Card[deckList.size()];
        deck = deckList.toArray(deck);

        Card[] shuffleDeck=  new Card[shuffle.size()];
        shuffleDeck = deckList.toArray(shuffleDeck);

        assertNotEquals(deck, shuffleDeck);

    }


}
