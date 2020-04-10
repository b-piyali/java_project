package _30_day_challenge.week1.day1;

import java.util.Arrays;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 * Input: [2,2,1]
 * Output: 1
 *
 * Example 2:
 * Input: [4,1,2,1,2]
 * Output: 4
 *
 */

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int singleNumber = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (i % 2 == 0)
                singleNumber += nums[i];
            else
                singleNumber -= nums[i];
        }
        return singleNumber;

        /*// Arrays.sort(nums);
        int sol = nums[0];
        for(int i = 1; i < nums.length; i++){
            sol = sol ^ nums[i];
        }
        return sol;*/
    }
}
