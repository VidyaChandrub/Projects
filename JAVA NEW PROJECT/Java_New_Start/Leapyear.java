import java.util.*;

public class Leapyear{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        boolean leap = false;

        // if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
        //     System.out.println("given year is leap year");
        // }else{
        //     System.out.println("given year is not leap year");
        // }

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0)
                    leap = true;
                    else
                    leap = false;   
            }
            else
            leap = true;
        }
        else 

        if(leap){
           System.out.println("given year is leap year"); 
        }else{
            System.out.println("given year is not leap year");
        }
    }
}