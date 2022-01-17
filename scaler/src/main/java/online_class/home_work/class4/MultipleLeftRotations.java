package online_class.home_work.class4;

import java.util.ArrayList;

public class MultipleLeftRotations {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> newList = new ArrayList<>();
        int len = A.size();
        reverseNum(A, 0, len - 1);
        for (int num : B) {
            num = num % len;
            ArrayList<Integer> list = new ArrayList<>(A);
            reverseNum(list, 0, (len - num - 1));
            reverseNum(list, len - num, len - 1);

            newList.add(list);
        }
        return newList;
    }

    private void reverseNum(ArrayList<Integer> nums, int from, int to) {
        while (from < to) {
            int temp = nums.get(from);
            nums.set(from, nums.get(to));
            nums.set(to, temp);
            from++;
            to--;
        }
    }
}
