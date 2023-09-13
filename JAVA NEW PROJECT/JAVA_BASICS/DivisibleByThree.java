public class DivisibleByThree {
    public static void main(String[] args) {
        // Create an array to store numbers divisible by 3
        int[] divisibleByThree = new int[10]; // The largest possible number of such values is 10 (30/3).

        int count = 0; // Counter for the number of divisible by 3 found

        // Find numbers between 1 to 30 that are divisible by 3
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                divisibleByThree[count] = i;
                count++;
            }
        }

        // Print the array of numbers divisible by 3
        System.out.println("Numbers between 1 to 30 that are divisible by 3:");
        for (int i = 0; i < count; i++) {
            System.out.print(divisibleByThree[i]);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
    }
}
