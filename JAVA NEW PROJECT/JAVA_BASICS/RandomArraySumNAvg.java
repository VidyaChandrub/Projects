import java.util.Random;

public class RandomArraySumNAvg {
    public static void main(String[] args) {
        // Define the size of the array
        int arraySize = 75;

        // Create an array to store random integers
        int[] randomArray = new int[arraySize];

        // Create a Random object to generate random numbers
        Random random = new Random();

        // Fill the array with random integers between 0 and 100
        for (int i = 0; i < arraySize; i++) {
            randomArray[i] = random.nextInt(101); // Generates random integers between 0 and 100
        }

        // Calculate the sum of the elements in the array
        int sum = 0;
        for (int num : randomArray) {
            sum += num;
        }

        // Calculate the average
        double average = (double) sum / arraySize;

        // Print the sum and average
        System.out.println("Random Array Sum: " + sum);
        System.out.println("Random Array Average: " + average);
    }
}

