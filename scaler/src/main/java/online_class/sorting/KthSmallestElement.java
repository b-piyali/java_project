package online_class.sorting;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElement {
    public int kthsmallest(final List<Integer> A, int B) {
        if (A.size() < B)
            return 0;
        List<Integer> newList = new ArrayList<>(A);
        mergeSort(newList, 0, A.size()-1);
        return newList.get(B);
    }

    private void mergeSort(List<Integer> list, int start, int end) {
        if (start == end)
            return;
        int mid = (start + end) / 2;
        mergeSort(list, start, mid);
        mergeSort(list, mid + 1, end);
        sort(list, start, mid, end);
    }

    private void sort(List<Integer> list, int start, int mid, int end) {
        List<Integer> tempList = new ArrayList<>();
        int p1 = start;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= end) {
            if (list.get(p1) <= list.get(p2)) {
                tempList.add(list.get(p1));
                p1++;
            } else {
                tempList.add(list.get(p2));
                p2++;
            }
        }
        while (p1 <= mid) {
            tempList.add(list.get(p1));
            p1++;
        }
        while (p2 <= end) {
            tempList.add(list.get(p2));
            p2++;
        }
        for (int i = 0; i < tempList.size(); i++) {
            list.set((i + start), tempList.get(i));
        }
    }
}
