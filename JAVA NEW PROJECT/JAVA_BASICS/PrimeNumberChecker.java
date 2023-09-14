import java.util.Random;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        // Take user input for array size, lower and upper limits
        int n = 10; // You can change the size as needed
        int lowerLimit = 1;
        int upperLimit = 100;

        // Generate a random array of size n between the lower and upper limits
        int[] randomArray = generateRandomArray(n, lowerLimit, upperLimit);

        // Print the original random array
        System.out.println("Original Random Array:");
        printArray(randomArray);

        // Find prime numbers and create a new array with non-prime numbers
        int[] nonPrimeArray = filterPrimeNumbers(randomArray);

        // Print the new non-prime array
        System.out.println("\nNon-Prime Array:");
        printArray(nonPrimeArray);

        // Count and print the number of prime numbers
        int primeCount = n - nonPrimeArray.length;
        System.out.println("\nNumber of Prime Numbers: " + primeCount);
    }

    // Function to generate a random array of size n between lower and upper limits
    public static int[] generateRandomArray(int n, int lower, int upper) {
        int[] randomArray = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            randomArray[i] = random.nextInt(upper - lower + 1) + lower;
        }
        return randomArray;
    }

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to filter out prime numbers from an array and create a new array
    public static int[] filterPrimeNumbers(int[] inputArray) {
        int[] nonPrimeArray = new int[inputArray.length];
        int count = 0;
        for (int num : inputArray) {
            if (!isPrime(num)) {
                nonPrimeArray[count++] = num;
            }
        }
        // Resize the non-prime array to the actual count of non-prime numbers
        int[] result = new int[count];
        System.arraycopy(nonPrimeArray, 0, result, 0, count);
        return result;
    }

    // Function to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}