package Arrays;
import java.util.Arrays;

public class copyarray {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6};
        int[] duplicate = new int[6];
        // int[] duplicate = arr;    // using assigment operator (shallow copy - refering to same object)

        // for(int d: duplicate){
        //     System.out.println(d);
        // }

        for(int i=0; i<arr.length; i++){
            duplicate[i] = arr[i];         // using loop (deep copy - refering to different object)
        }

        System.out.println(Arrays.toString(duplicate));  
    }
}
