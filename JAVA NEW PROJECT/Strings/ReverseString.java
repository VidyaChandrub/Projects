import java.util.Scanner;

public class ReverseString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String :");
        String str = sc.nextLine();
        System.out.println(reverseString(str));
    }

        public static String reverseString(String str){
            String revString="";
           // char[] chars = str.toCharArray();

            for(int i=str.length()-1; i>=0; i--){
                revString=revString+str.charAt(i);
            }

            return revString;
        
        }
        
    
}