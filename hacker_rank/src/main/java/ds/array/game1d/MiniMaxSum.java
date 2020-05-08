package ds.array.game1d;

public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {
        int len = arr.length;
        Long maxval = Long.MIN_VALUE;
        Long minval = Long.MAX_VALUE;
        Long sum = Long.valueOf(0);
        for(int i=0; i<len; i++){
            sum = sum +arr[i];
            if(maxval < arr[i]){
                maxval = Long.valueOf(arr[i]);
            }
            if(minval > arr[i]){
                minval = Long.valueOf(arr[i]);
            }
        }
        System.out.println((sum-maxval) +" "+(sum-minval));
    }
}
