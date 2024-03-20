package com.github.zipcodewilmington;

import com.github.zipcodewilmington.utils.Card;
import com.github.zipcodewilmington.utils.Rank;
import com.github.zipcodewilmington.utils.Suit;
import org.junit.Assert;
import org.junit.Test;

public class cardTest {
    @Test
    public void testCardConstructor(){

        Rank expectedRank =  Rank.ACE;
        Suit expectedSuit = Suit.SPADES;

        Card test = new Card(expectedRank, expectedSuit);
        Assert.assertEquals(expectedRank, test.getRank());
        Assert.assertEquals(expectedSuit, test.getSuit());
    }
    @Test
    public void testCardToString(){
        Rank expectedRank =  Rank.ACE;
        Suit expectedSuit = Suit.SPADES;

        Card test = new Card(expectedRank, expectedSuit);

        String expected = "Card{ACE SPADES}";
        String actual = test.toString();
        Assert.assertEquals(expected, actual);
    }

}
