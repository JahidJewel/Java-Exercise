/*
* Student Name: Jahidul Islam
 * TRU ID: T00752321
 * File Name: guessingLetter
 *
 *  Design and implement an application that plays the Over-Under guessing game using single letters. The program should pick a random letter between ‘a’ and ‘z’ (inclusive), then repeatedly prompt the user to guess the letter. On each guess, report to the user that they are correct or that the guess is over or under the random letter. Continue accepting guesses until the user guesses correctly or chooses to quit. Count the number of guesses and report that value when the user guesses correctly. If a guess is not a letter, an appropriate message should be displayed to the user and the guess not be counted. At the end of each game (by quitting or a correct guess), prompt to determine whether the user wants to play again. Continue playing another game until the user chooses to stop.

Note: The following code will randomly generate a single letter:

Random rng = new Random();

char c = (char)('a ' + rng.nextInt(26));

Hint: This will require a nest of loops—the outer loop to play each game until the user chooses to stop and the inner loop to prompt the user for each guess in a game.

Testing: Include exhibits that demonstrate all the program’s features: multiple completed games, a game quit in progress, and how an input out of range is handled.
* */


import java.util.Random;
import java.util.Scanner;

public class guessingLetter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) { // the outer loop to play each game until the user chooses to stop
            char targetLetter = (char) (random.nextInt(26) + 'a'); //to randomly generate single letter from a to z
            int guessCount = 0; // to count the number of total guesses
            boolean guessedCorrectly = false;

            System.out.println("A new game has started! Guess the letter between 'a' and 'z'.");

            while (!guessedCorrectly) { // inner loop to prompt the user for each guess in a game
                System.out.print("Enter your guess (or '0' to quit): ");
                String input = scanner.nextLine().toLowerCase();

                if (input.length() != 1) {
                    System.out.println("Invalid input. Please enter a single letter.");
                    continue;
                }

                char guess = input.charAt(0);

                if (guess == '0') { // incase user wants to quit in the middle of guessing
                    System.out.println("You chose to quit. The correct letter was '" + targetLetter + "'.");
                    break;
                }

                if (guess < 'a' || guess > 'z') { // if user input is not letter
                    System.out.println("Invalid input. Please enter a letter between 'a' and 'z'.");
                    continue;
                }

                guessCount++;
                if (guess == targetLetter) {
                    guessedCorrectly = true;
                    System.out.println("Congratulations! You've guessed the correct letter '" + targetLetter + "' in " + guessCount + " guesses.");
                } else if (guess < targetLetter) {
                    System.out.println("The guess is under the target letter.");
                } else {
                    System.out.println("The guess is over the target letter.");
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.nextLine().toLowerCase();
            playAgain = response.equals("yes");
        }

        System.out.println("Thank you for playing the Over-Under Guessing Game!");

    }
}
