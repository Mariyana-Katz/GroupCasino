package com.github.zipcodewilmington.casino.games.BlackJack;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.GamblingGame;
import com.github.zipcodewilmington.casino.PlayerInterface;
//import com.github.zipcodewilmington.casino.cards.Card;
//import com.github.zipcodewilmington.casino.cards.Face;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.Card;
import com.github.zipcodewilmington.utils.IOConsole;
import com.github.zipcodewilmington.utils.Rank;

import java.util.ArrayList;

public class BlackJackPlayer implements PlayerInterface, GamblingGame {

    CasinoAccount casinoAccount;
    int sumOfCards;
    boolean bust;
    boolean play = true;
    boolean stand = false;
    ArrayList<Card> hand;
    private final IOConsole console = new IOConsole(AnsiColor.BLUE);

    public BlackJackPlayer(CasinoAccount casinoAccount){
        this.casinoAccount = casinoAccount;
        this.hand = new ArrayList<Card>();
        this.bust = false;
        this.sumOfCards = 0;

    }

    @Override
    public CasinoAccount getArcadeAccount() {
        return this.casinoAccount;
    }

    @Override
    public Boolean play() {
        return this.play;
    }

    public double cashOut(double winnings){
        return getArcadeAccount().getBalance() + winnings;
    }

    public void addToHand(Card card){
        sumOfCards = card.getRank().getCardValue();
        //sumOfCards = card.getFaceValue().getCardValue();
        hand.add(card);
    }

    public ArrayList<Card> getHand(){
        return this.hand;
    }

    public void setSumOfCards(int sumOfCards) {
        this.sumOfCards = sumOfCards;
    }

    public int getSumOfCards(){
        determineAceValue();
        return this.sumOfCards;
    }

    public Object stand() {
        this.stand = true;
        return true;
    }

    public boolean getStand(){
        return this.stand;
    }

    public void determineAceValue(){
        for(Card c : this.hand){
            if(c.getRank() == Rank.ACE){
                if(this.sumOfCards - 1 == 10){
                    this.sumOfCards = 21;
                }
            }
        }
    }

    public void printHand(){
        StringBuilder sb = new StringBuilder("Current hand: \n");

        for(Card c : this.hand){
            sb.append(c.getRank().toString() + " of " + c.getSuit().toString() + "\n");
        }

        System.out.println(sb.toString());
    }

    @Override
    public Double placeBets(double moneyToBet) {
        return moneyToBet;
    }

    public void printBalance(){
        System.out.println("Current balance: " + casinoAccount.getBalance());
    }
}