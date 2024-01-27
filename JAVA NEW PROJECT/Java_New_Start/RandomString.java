import java.util.*;

public class RandomString{
    public static void main(String args[]){

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        StringBuilder sb = new StringBuilder();

        Random random = new Random();

        int length = 6;
        for(int i=0; i<=length; i++){
            int index = random.nextInt(str.length());

            char randomchar = str.charAt(index);

            sb.append(randomchar);l
        }

        String str2 = sb.toString();
        System.out.println(str2);
        
    }
}