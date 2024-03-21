package com.github.zipcodewilmington.casino.games.HigherCards;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.PlayerInterface;

import java.lang.reflect.ParameterizedType;

/**
 * Created by leon on 7/21/2020.
 */
public class HigherCardPlayer implements PlayerInterface{
    private CasinoAccount casinoAccount;
    public HigherCardPlayer(CasinoAccount casinoAccount){
        this.casinoAccount = casinoAccount;
    }

    public HigherCardPlayer() {

    }

    @Override
    public CasinoAccount getArcadeAccount() {
        return null;
    }

    @Override
    public <SomeReturnType> SomeReturnType play() {
        return null;
    }
}