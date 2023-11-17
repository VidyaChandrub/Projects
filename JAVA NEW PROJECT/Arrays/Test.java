package Arrays;

public class Test {
    public static void main(String args[]){

        int[] arr = {1,4,6,-8,-2,0,10,34,-12};
        int sum = 0;
        double avg;

        for(int n : arr){
            sum += n;
        }

        int arrLength = arr.length;

        avg = ((double)sum/(double)arrLength);

        System.out.println(sum);
        System.out.println(avg);
    }
}
