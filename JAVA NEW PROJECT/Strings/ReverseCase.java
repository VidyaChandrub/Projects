import java.util.*;

public class ReverseCase{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :");
        String str = sc.nextLine();

        String reverse = ReverseCaseWord(str);
        System.out.println("Reverse String :" + reverse);

    }

        public static String ReverseCaseWord(String str){
            StringBuilder result = new StringBuilder();
            for(int i=0; i<str.length(); i++){
                char c = str.charAt(i);
                if(Character.isUpperCase(c)){
                    result.append(Character.toLowerCase(c));
                }
                else if(Character.isLowerCase(c)){
                    result.append(Character.toUpperCase(c));
                }
                else{
                    result.append(c);
                }
            }
            return result.toString();
        }
    
} 

/*import java.util.Scanner;

public class ReverseCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        
        String reversed = reverseCase(input);
        
        System.out.println("Reversed Case: " + reversed);
        
        scanner.close();
    }

    public static String reverseCase(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c); // Non-alphabet characters remain unchanged
            }
        }

        return result.toString();
    }
}
*/