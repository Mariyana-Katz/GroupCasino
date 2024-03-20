    package com.github.zipcodewilmington.casino.games.slots;
    import java.util.Random;
    import java.util.Scanner;
    /**
     * Created by leon on 7/21/2020.
     */
    public class SlotsGame {
        private static final int[] symbols = {1, 2, 3, 4, 5};
            private static final int JACKPOT_MULTIPLIER = 100;
            private static final int MATCH_MULTIPLIER = 10;
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Random random = new Random();
                System.out.println("Welcome to the Slot Machine!");
                System.out.println("Press Enter to spin the reels. Type 'exit' to quit.");
                while (playGame(scanner, random)) {
                    System.out.print("Do you want to play again? (yes/no): ");
                    String playAgainInput = scanner.nextLine();
                    if (!playAgainInput.equalsIgnoreCase("yes") && !playAgainInput.equalsIgnoreCase("y")) {
                        break;
                    }
                }
                System.out.println("Thanks for playing!");
                scanner.close();
            }
            private static boolean playGame(Scanner scanner, Random random) {
                System.out.print("Press Enter to spin: ");
                String input = scanner.nextLine();
                int[] result = new int[3];
                for (int i = 0; i < 3; i++) {
                    result[i] = symbols[random.nextInt(symbols.length)];
                }
                System.out.println("Spinning...");
                System.out.printf("%d - %d - %d%n", result[0], result[1], result[2]);
                if (result[0] == result[1] && result[1] == result[2]) {
                    System.out.println("Congratulations! You hit the Jackpot! You win " + JACKPOT_MULTIPLIER + " times your bet!");
                } else if (result[0] == result[1] || result[1] == result[2] || result[0] == result[2]) {
                    System.out.println("Matched 2 symbols! You win " + MATCH_MULTIPLIER + " times your bet!");
                } else {
                    System.out.println("Sorry, you didn't win this time.");
                }
                return true;
            }
        }