package problem228;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> str = new ArrayList<>();
        if(nums.length==0)
            return str;
        int previous = nums[0];

        int start = previous;
        //newString.append(start);
        for (int num : nums) {
            if (num > previous + 1) {
                StringBuilder newString = new StringBuilder();
                newString.append(start);
                if (start != previous) {
                    newString.append("->");
                    newString.append(previous);
                }
                previous = num;
                start = previous;
                str.add(newString.toString());
            } else {
                previous = num;
            }
        }
        StringBuilder newString = new StringBuilder();
        newString.append(start);
        if (start != previous) {
            newString.append("->");
            newString.append(previous);
        }
        str.add(newString.toString());
        return str;
    }
}
