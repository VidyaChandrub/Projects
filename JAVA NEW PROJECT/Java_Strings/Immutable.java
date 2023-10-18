public class Immutable{
    public static void main(String args[]){

        String str = "Hello";

        str.concat("world");

        System.out.println(str);

        String str1 = new String("Hello");

        str1.concat("Baby");

         System.out.println(str1);


    }
}