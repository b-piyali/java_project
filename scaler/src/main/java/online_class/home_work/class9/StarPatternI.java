package online_class.home_work.class9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StarPatternI {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            ArrayList<ArrayList<String>> ans = pattern(num);

            for (ArrayList<String> row : ans) {
                for (String s : row) {
                    System.out.print(s);
                }
                System.out.println();
            }
        }
    }

    public static ArrayList<ArrayList<String>> pattern(int num) {
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        int len = num + num;
        for (int i = 0; i < len; i++) { // initializing matrix with * value
            ArrayList<String> temp = new ArrayList<>(Collections.nCopies(len, "*"));
            ans.add(temp);
        }
        int start = num - 1;
        int end = num;
        boolean upperIteration = true;
        for (int i = 1; i < len - 1; ++i) {
            for (int j = start; j <= end; ++j) {
                ans.get(i).set(j, " ");
            }
            if (start > 1 && upperIteration) {
                start--;
            } else if (upperIteration && start == 1 && end == (len - 2)) {
                upperIteration = false;
            } else {
                upperIteration = false;
                start++;
            }

            if (end < len - 2 && upperIteration) {
                end++;
            } else if (start == 1 && end == (len - 2)) {
                upperIteration = false;
            } else {
                upperIteration = false;
                end--;
            }
        }
        return ans;
    }
}
