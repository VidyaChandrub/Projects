import java.util.*;

public class VowelConstant{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if(ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'a'){
            System.out.println("Given character is vowel");
        }else {
             System.out.println("Given character is Constant");
        }
    }
}