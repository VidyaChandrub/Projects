import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number for which to generate the table
        System.out.print("Enter a number: ");

        // Read the number from the user
        int number = scanner.nextInt();

        // Close the Scanner to prevent resource leak
        scanner.close();

        // Generate and print the multiplication table
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
