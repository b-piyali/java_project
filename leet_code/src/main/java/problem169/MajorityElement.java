package problem169;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int majorEle = nums[0];
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                count++;
                majorEle = num;
            } else if (majorEle != num) {
                count--;
            } else {
                count++;
            }
        }

        count = 0;
        for (int num : nums) {
            if (num == majorEle) {
                count++;
            }
        }
        if (count > nums.length / 2)
            return majorEle;
        else
            return 0;
    }

    public int majorityElement2(int[] nums) {
        Map<Integer, Integer> majority = new HashMap<>();
        for (int num : nums) {
            majority.merge(num, 1, Integer::sum);
            if (majority.get(num) > nums.length / 2) {
                return num;
            }
        }
        return 0;
    }
}
