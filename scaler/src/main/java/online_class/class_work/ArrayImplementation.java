package online_class.class_work;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayImplementation {
    // 5, 7, 3, 7, 2, 8, 3, 7, 2
    //5, 1
    //7, 3
    //3 , 2
    //2, 2
    //8, 1
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(5, 7, 3, 7, 2, 8, 3, 7, 2));
        //Map<Integer, Integer> numCount = countOccurance(nums);
        Map<Integer, Long> numCount = nums.stream().collect(Collectors.groupingBy(num -> num, Collectors.counting()));
        Set<Integer> numSet = new LinkedHashSet<>(nums);
        numSet.forEach(num -> System.out.println(num + " " + numCount.get(num)));
    }

    public void printOccurrence(List<Integer> nums) {
        Map<Integer, Integer> numCount = countOccurrence(nums);
        Set<Integer> numSet = new LinkedHashSet<>(nums);
        numSet.forEach(num -> System.out.println(num + " " + numCount.get(num)));
    }

    private Map<Integer, Integer> countOccurrence(List<Integer> nums) {
        Map<Integer, Integer> numCount = new HashMap<>();
        for (int num : nums) {
            numCount.merge(num, 1, Integer::sum);
        }
        return numCount;
    }
}
