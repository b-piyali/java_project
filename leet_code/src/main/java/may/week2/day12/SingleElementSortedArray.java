package may.week2.day12;

public class SingleElementSortedArray {
    public int singleNonDuplicate(int[] nums) {
        int len = nums.length;
        if (len == 1)
            return nums[0];

        int i = 0;
        do {
            if (nums[i] != nums[i + 1])
                return nums[i];
            i += 2;
        } while (i < len - 1);
        return nums[i];
    }
}
