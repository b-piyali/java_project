package online_class.sorting;

import java.util.ArrayList;

public class MergeSort {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        mergeSort(A, 0, A.size());
        return A;
    }

    private void mergeSort(ArrayList<Integer> A, int start, int end) {
        if (start == end)
            return;
        int mid = (start + end) / 2;
        mergeSort(A, start, mid);
        mergeSort(A, mid + 1, end);
        sort(A, start, mid, end);
    }

    private void sort(ArrayList<Integer> A, int start, int mid, int end) {
        ArrayList<Integer> tempList = new ArrayList<>();
        int p1 = start;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= end) {
            if (A.get(p1) <= A.get(p2)) {
                tempList.add(A.get(p1));
                p1++;
            } else {
                tempList.add(A.get(p2));
                p2++;
            }
        }
        while (p1 <= mid) {
            tempList.add(A.get(p1));
            p1++;
        }
        while (p2 <= end) {
            tempList.add(A.get(p2));
            p2++;
        }
        for (int i = 0; i < tempList.size(); i++) {
            A.set((i + start), tempList.get(i));
        }
    }
}
