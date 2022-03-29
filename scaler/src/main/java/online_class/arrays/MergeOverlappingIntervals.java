package online_class.arrays;

import java.util.ArrayList;
import java.util.Comparator;

public class MergeOverlappingIntervals {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        intervals.sort(Comparator.comparingInt(i -> i.start));
        int index = 0;
        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).start <= intervals.get(index).end) {
                intervals.get(index).end = Math.max(intervals.get(index).end, intervals.get(i).end);
            } else {
                index++;
                intervals.set(index, intervals.get(i));
            }
        }
        ArrayList<Interval> answer = new ArrayList<>();

        for (int i = 0; i <= index; i++) {
            answer.add(intervals.get(i));
        }
        return answer;
    }
}
