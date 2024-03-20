package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.games.Trivia.Trivia;
import com.github.zipcodewilmington.casino.games.Trivia.Questions;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriviaTest {


//1
@Test
    public void getPlayerAnswerTest1(){
    Trivia trivia = new Trivia();

    String playerAnswer = "";
    String expectedAnswer = "";
    String actualAnswer = trivia.getPlayerAnswer(playerAnswer);

    assertEquals(expectedAnswer, actualAnswer);
}

    //1.1
    @Test
    public void getPlayerAnswerTest2(){
        Trivia trivia = new Trivia();

        String playerAnswer = "";
        String expectedAnswer = "";
        String actualAnswer = trivia.getPlayerAnswer(playerAnswer);

        assertEquals(expectedAnswer, actualAnswer);
    }

    //1.2
    @Test
    public void getPlayerAnswerTest3(){
        Trivia trivia = new Trivia();

        String playerAnswer = "";
        String expectedAnswer = "";
        String actualAnswer = trivia.getPlayerAnswer(playerAnswer);

        assertEquals(expectedAnswer, actualAnswer);
    }


//2
    @Test
    public void checkAnswerTest1(){
        Trivia trivia = new Trivia();


        Boolean expectedAnswer = true;
        String question = "";

        String actualAnswer = trivia.checkAnswer(question);

        assertEquals(expectedAnswer, actualAnswer);
    }


    //2.1
    @Test
    public void checkAnswerTest2(){
        Trivia trivia = new Trivia();


        Boolean expectedAnswer = true;
        String question = "";

        String actualAnswer = trivia.checkAnswer(question);

        assertEquals(expectedAnswer, actualAnswer);
    }

    //2.2
    @Test
    public void checkAnswerTest3(){
        Trivia trivia = new Trivia();


        Boolean expectedAnswer = true;
        String question = "";

        String actualAnswer = trivia.checkAnswer(question);

        assertEquals(expectedAnswer, actualAnswer);
    }



    //3
    @Test
    public void updateScoreTest1(){
        Questions questions = new Questions();


        String expectedAnswer = "";


        String actualAnswer = questions.getCorrectAnswer();

        assertEquals(expectedAnswer, actualAnswer);
    }

    //3.1
    @Test
    public void updateScoreTest2(){
        Questions questions = new Questions();


        String expectedAnswer = "";


        String actualAnswer = questions.getCorrectAnswer();

        assertEquals(expectedAnswer, actualAnswer);
    }

    //3.2
    @Test
    public void updateScoreTest3(){
        Questions questions = new Questions();


        String expectedAnswer = "";


        String actualAnswer = questions.getCorrectAnswer();

        assertEquals(expectedAnswer, actualAnswer);
    }



















}
