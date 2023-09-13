import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call a function to reverse and print the string
        reverseAndPrint(inputString);

        scanner.close();
    }

    public static void reverseAndPrint(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Iterate through the character array in reverse order and print each character
        System.out.print("Reversed String: ");
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
        System.out.println(); // Print a newline for better formatting
    }
}
