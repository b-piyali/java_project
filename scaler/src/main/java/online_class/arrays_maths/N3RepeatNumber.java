package online_class.arrays_maths;

import java.util.List;

public class N3RepeatNumber {
    public int repeatedNumber(final List<Integer> a) {
        if (a.size() <= 1)
            return -1;
        int N = a.size();

        int count1 = 0, count2 = 0, ele1 = a.get(0), ele2 = a.get(1);
        for (int num : a) {
            if (ele1 == num)
                count1++;
            else if (ele2 == num)
                count2++;
            else if (count1 == 0) {
                count1++;
                ele1 = num;
            } else if (count2 == 0) {
                count2++;
                ele2 = num;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int num : a) {
            if (ele1 == num)
                count1++;
            else if (ele2 == num)
                count2++;

            if (count1 > N / 3) {
                return ele1;
            } else if (count2 > N / 3) {
                return ele2;
            }
        }
        return -1;
    }

}
