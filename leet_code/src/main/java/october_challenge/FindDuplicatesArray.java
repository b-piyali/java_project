package october_challenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesArray {
    private static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        Set<Integer> distinctNums = new HashSet<>();
        for(int num: nums){
            if(distinctNums.contains(num) && !duplicates.contains(num)){
                duplicates.add(num);
            }else{
                distinctNums.add(num);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        int[] nums={1,1,2};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(findDuplicates(nums));
    }
}
