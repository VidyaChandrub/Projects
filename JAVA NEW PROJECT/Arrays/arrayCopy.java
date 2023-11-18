package Arrays;
import java.util.Arrays;

public class arrayCopy {
    public static void main(String[] args) {
        int[] n1 ={1,2,3,4,5,6,7,8};
        
        int[] n2 = new int[n1.length];
        int[] n3 = new int[5];

        System.arraycopy(n1, 0, n2, 0, n1.length);  //using arraycopy method

        System.out.println(Arrays.toString(n2));

        System.arraycopy(n1, 2, n3, 1, 2);

        System.out.println(Arrays.toString(n3));

        int[] n4 = Arrays.copyOfRange(n1,2,5);  // using copyOfRange method of array
        System.out.println(Arrays.toString(n4));
    }
}
