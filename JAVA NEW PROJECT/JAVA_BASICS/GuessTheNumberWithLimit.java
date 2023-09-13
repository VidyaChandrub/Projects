import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberWithLimit {
    public static void main(String[] args) {
        // Create a Random object to generate the random number
        Random random = new Random();

        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        int maxAttempts = 7; // Limit on the number of attempts
        int attempts = 0;
        boolean guessedCorrectly = false;

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I have selected a random number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess the number.");

        while (attempts < maxAttempts) {
            System.out.print("Attempt " + (attempts + 1) + ": Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                guessedCorrectly = true;
                break; // Exit the loop when the correct number is guessed
            }
        }

        // Check if the user guessed correctly or reached the limit
        if (guessedCorrectly) {
            System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly!");
            System.out.println("It took you " + attempts + " attempts.");
        } else {
            System.out.println("Sorry, you've reached the maximum number of attempts.");
            System.out.println("The correct number was " + randomNumber + ". Computer wins!");
        }

        // Close the Scanner
        scanner.close();
    }
}
