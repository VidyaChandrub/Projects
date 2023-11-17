package Arrays;

public class Multidimensionarray {
    public static void main(String args[]){
        int[][] TwoDarr = {
            {1,2,3,4},
            {3,4,5}
        };

        // for(int i=0; i<TwoDarr.length; ++i){
        //     for(int j=0; j<TwoDarr[i].length; ++j){
        //         System.out.println(TwoDarr[i][j]);
        //     }
        // }

        for(int[] i: TwoDarr){
            for(int j: i){
                System.out.println(j);
            }
        }
    }
}
