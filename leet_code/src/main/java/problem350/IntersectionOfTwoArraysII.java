package problem350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] smallerArray = nums1.length <= nums2.length ? nums1 : nums2;
        int[] largerArray = smallerArray == nums1 ? nums2 : nums1;
        List<Integer> output = new ArrayList<>();
        List<Integer> inputList = Arrays.stream(largerArray)
                .boxed()
                .collect(Collectors.toList());

        for (int num : smallerArray) {
            if (inputList.contains(num)) {
                output.add(num);
            }
        }
        return output.stream().mapToInt(i -> i).toArray();
    }
}
