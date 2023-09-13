import java.util.Scanner;
import java.util.Random;

public class RandomNumberArrayGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAttempts = 3;
        int attempt = 0;
        int arraySize = 0;
        
        // Loop to get a valid array size input
        while (attempt < maxAttempts) {
            System.out.print("Enter the size of the array (1 to 10): ");
            arraySize = scanner.nextInt();

            if (arraySize >= 1 && arraySize <= 10) {
                break; // Valid input, exit the loop
            } else {
                attempt++;
                if (attempt < maxAttempts) {
                    System.out.println("Invalid input. Please enter a number between 1 and 10.");
                } else {
                    System.out.println("Array size entered is not correct. Exiting.");
                    System.exit(1); // Exit the program
                }
            }
        }

        // Create an array of the specified size and populate it with random numbers
        double[] randomArray = new double[arraySize];
        Random random = new Random();

        for (int i = 0; i < arraySize; i++) {
            randomArray[i] = 100.0 + (random.nextDouble() * 400.0); // Generates random numbers between 100.0 and 500.0
        }

        // Print the generated array
        System.out.println("Random Numbers Array:");
        for (int i = 0; i < arraySize; i++) {
            System.out.println(randomArray[i]);
        }
    }
}
