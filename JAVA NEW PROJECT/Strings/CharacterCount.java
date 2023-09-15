import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int alphabetCount = countAlphabets(input);
        int digitCount = countDigits(input);
        int specialCharCount = countSpecialCharacters(input);

        System.out.println("Alphabets: " + alphabetCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Special Characters: " + specialCharCount);

        scanner.close();
    }

    public static int countAlphabets(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }

    public static int countDigits(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    public static int countSpecialCharacters(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                count++;
            }
        }
        return count;
    }
}
