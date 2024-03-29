package exam;

public class Solution {
    public int solution(int[] s){
        int max_sum =0;
        int current_sum = 0;
        boolean positive = false;
        int n =s.length;
        for(int i=0; i<n; ++i){
            int item = s[i];
            if(item < 0){
                if(max_sum < current_sum){
                    max_sum = current_sum;
                    current_sum = 0;
                }
            }else{
                positive = true;
                current_sum+=item;
            }
        }
        if(current_sum > max_sum){
            max_sum = current_sum;
        }
        if(positive){
            return max_sum;
        }
        return  -1;
    }
}
