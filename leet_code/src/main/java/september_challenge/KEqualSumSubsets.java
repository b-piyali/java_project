package september_challenge;

import java.util.ArrayList;
import java.util.List;

public class KEqualSumSubsets {
    private static List<Integer> getSumSubsets(int[] nums){
        int subSet =0;
        List<Integer> subSetSum = new ArrayList<>();
        int len = nums.length;
        for(int i = 0; i < (1<<len); i++){
            int sum =0;
            for(int j = 0; j < len; j++){
                if ((i & (1 << j)) > 0){
                    sum+= nums[j];
                }
            }
            subSetSum.add(sum);
            subSet++;
            System.out.println(subSet +" --> "+sum);
        }
        return subSetSum;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,1};
        List<Integer> subSetSum = getSumSubsets(nums);
    }

    public boolean canPartitionKSubsets(int[] nums, int k) {
        List<Integer> subSetSum = getSumSubsets(nums);
        //for()
return false;
    }
}
