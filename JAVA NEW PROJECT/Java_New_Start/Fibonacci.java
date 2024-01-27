import java.util.Scanner;

public class Fibonacci{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        int first = 0, second = 1;

        for(int i=1; i<=n; i++){
            System.out.println(first);
            int third = first + second;
            
            first = second;
            second = third;
        }
    }
}