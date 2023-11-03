/*import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        String reversedSentence = reverseWordsInSentence(inputSentence);

        System.out.println("Reversed sentence: " + reversedSentence);

        scanner.close();
    }

    public static String reverseWordsInSentence(String input) {
        String[] words = input.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            String reversedWord = reverseWord(word);
            reversedSentence.append(reversedWord).append(" ");
        }

        return reversedSentence.toString().trim(); // Remove trailing space
    }

    public static String reverseWord(String word) {
        StringBuilder reversedWord = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord.append(word.charAt(i));
        }
        return reversedWord.toString();
    }
}
*/
