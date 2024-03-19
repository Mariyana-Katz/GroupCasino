    package com.github.zipcodewilmington.casino.games.slots;
    import java.util.Random;
    import java.util.Scanner;
    /**
     * Created by leon on 7/21/2020.
     */
    public class SlotsGame {

    private static final int[] S={1, 2, 3, 4, 5, 6, 7, 8, 9};

    private static int JACKPOT_MULTIPLIER=100;
    private static int MATCH_MULTIPLIER=10;
    public static void main(String[] args) {
        System.out.println("Welcome to the Slots Game:");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Press Enter to Start the Game:");
        System.out.println("Type q to Exit:");
        while(true){
            String input=sc.nextLine();
            if(input.equalsIgnoreCase("q")){
                System.out.println("Thanks for Playing");
                break;
            }
            int[] result=new int[3];
            for(int i=0;i<3;i++){
                result[i]=S[random.nextInt(S.length)];
            }
            System.out.printf("%d-%d -%d%n",result[0],result[1],result[2]);
            if (result[0] == result[1] && result[1] == result[2]){
                System.out.println("Congratulation you Win"+JACKPOT_MULTIPLIER);
            }else if(result[0] == result[1] || result[1] == result[2] || result[0]==result[2]){
                System.out.println("Matched two numbers! you win"+MATCH_MULTIPLIER);
            }else{
                System.out.println("Sorry you lose the Game");
            }

        }


    }
    }
