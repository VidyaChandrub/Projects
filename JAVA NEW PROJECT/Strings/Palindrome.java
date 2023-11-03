import java.util.Scanner;

public class Palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.next();
        System.out.println(palindromecheck(str));

    }

    public static String palindromecheck(String str){
        String reverseString="";
        for(int i=str.length()-1; i>=0; i--){
            reverseString += str.charAt(i);
        }
        
        if(reverseString.toLowerCase().equals(str.toLowerCase())){
            return "Given String is a Palindrome";
        }else{
            
            return "Given String is not a Palindrome";

        }
    }
}