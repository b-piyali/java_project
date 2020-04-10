package problem1;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            long sum = nums[i] + nums[j];
            if (sum == target)
                return new int[]{i, j};
            if (sum < target)
                i++;
            else
                j--;
        }
        return null;

        /*Set<Integer> elementSet = new HashSet<>();

        for (int num : nums)
            elementSet.add(num);

        for(int num : nums){
            int rem = Math.abs(target - num);
            if(elementSet.contains(rem))
                return new int[]{num, rem};
        }
        return null;*/
    }
}
