import java.util.Scanner;

public class Palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.next();
        System.out.println(palindromecheck(str));

    }

    public static String palindromecheck(String str){
        String revString="";
        for(int i=str.length()-1; i>=0; i--){
            revString += str.charAt(i);
        }
        
        if(revString.toLowerCase().equals(str.toLowerCase())){
            return "Given String is a Palindrome";
        }else{
            return 1;
            return "Given String is not a Palindrome";

        }
    }
}