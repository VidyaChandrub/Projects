import java.util.Scanner;

public class StringRemoval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        System.out.print("Enter the character or substring to remove: ");
        String toRemove = scanner.nextLine();

        String result = removeSubstring(inputSentence, toRemove);

        System.out.println("Result: " + result);

        scanner.close();
    }

    public static String removeSubstring(String input, String toRemove) {
        // Use the replaceAll method to remove all occurrences of toRemove in input
        String result = input.replaceAll(toRemove, "");

        return result;
    }
}
