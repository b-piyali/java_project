package online_class.bit_manipulations;

import java.util.ArrayList;

public class SubarraysBitwiseOR1 {
    public Long solve(int A, ArrayList<Integer> B) {
        long totalSubArray = (long) A *(A+1)/2;
        long zeroSubArray =0;
        long count=0;
        for(int num : B){
            if(num ==0){
                count++;
            }else{
                zeroSubArray += count * (count+1)/2 ;
                count =0;
            }
        }
        zeroSubArray += count * (count+1)/2 ;
        return totalSubArray-zeroSubArray;
    }
}
