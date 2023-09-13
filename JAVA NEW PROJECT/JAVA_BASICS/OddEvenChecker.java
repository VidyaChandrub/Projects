import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter an integer: ");

        // Read the integer from the user
        int number = scanner.nextInt();

        // Close the Scanner to prevent resource leak
        scanner.close();

        // Check if the number is odd or even using an if-else statement
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
