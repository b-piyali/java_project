package online_class.arrays;

import java.util.ArrayList;

public class Flip {
    public ArrayList<Integer> flip(String A) {
        ArrayList<Integer> res = new ArrayList<>();
        int l = 0, sum = 0, maxSum = 0;

        ArrayList<Integer> arr = constructArray(A);
        ArrayList<Integer> pair = kadaneSum(l, sum, maxSum, arr);

        if (pair.get(0) == Integer.MAX_VALUE) {
            return res;
        }

        res.add(pair.get(0) + 1);
        res.add(pair.get(1) + 1);
        return res;
    }

    //Kadane algorithm
    private ArrayList<Integer> kadaneSum(int l, int sum, int maxSum, ArrayList<Integer> arr) {
        ArrayList<Integer> pair = new ArrayList<>();
        pair.add(Integer.MAX_VALUE);
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum < 0) {
                sum = 0;
                l = i + 1;
            }
            if (maxSum < sum) {
                maxSum = sum;
                pair.add(0, l);
                pair.add(1, i);
            }
        }
        return pair;
    }

    private ArrayList<Integer> constructArray(String A) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '0') {
                arr.add(1);
            } else {
                arr.add(-1);
            }
        }
        return arr;
    }
}
