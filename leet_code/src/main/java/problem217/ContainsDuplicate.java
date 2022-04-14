package problem217;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    private static boolean containsDuplicateBrute(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }

    private static boolean containsDuplicateSet(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        return (nums.length != numSet.size());
    }

    private static boolean containsDuplicateSet2(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            if (numSet.contains(num))
                return true;
            numSet.add(num);
        }
        return false;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(containsDuplicateBrute(nums));
        System.out.println(containsDuplicateSet(nums));

    }
}
