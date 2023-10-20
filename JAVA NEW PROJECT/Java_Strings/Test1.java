import java.util.*;

public class Test1{
    public static void main(String args[]){
        String str = "Hello World"; //creating strings
        System.out.println(str);

        System.out.println(str.length());  //to print the length of string

        String str2 = " Good Morning";
        System.out.println(str.concat(str2));  //concatinating two strings

        String str3 = new String("Vidya");
        String str4 = new String("Vidya");

        System.out.println(str3.concat(str4));

        //Difference between == and equals
        boolean result1  = (str3 == str4);  //checks reference variable
        System.out.println(result1);

        boolean result2 = str3.equals(str4);  //checks the content
        System.out.println(result2);

        char[] arr = str.toCharArray();
        System.out.println(arr);

        System.out.println(str2.indexOf('d'));

    }
}