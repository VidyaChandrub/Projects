import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordExtractor {
    public static void main(String[] args) {
        String sentence = "My name is Vidya C.";
        String[] words = extractWords(sentence);
        System.out.println(Arrays.toString(words));
    }

    public static String[] extractWords(String input) {
        // Split the input sentence into words based on spaces and punctuation
        String[] words = input.split(" ");
        
        // Filter out any empty strings and trim leading/trailing spaces
        List<String> wordList = new ArrayList<>();
        for (String word : words) {
            word = word.trim();
            if (!word.isEmpty()) {
                wordList.add(word);
            }
        }

        // Convert the list of words to an array
        String[] result = new String[wordList.size()];
        result = wordList.toArray(result);

        return result;
    }
}
