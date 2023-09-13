import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Create a Random object to generate the random number
        Random random = new Random();

        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        int attempts = 0;
        boolean guessedCorrectly = false;

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I have selected a random number between 1 and 100.");

        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
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
                System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly!");
                System.out.println("It took you " + attempts + " attempts.");
            }
        }

        // Close the Scanner
        scanner.close();
    }
}
