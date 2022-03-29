package online_class.subsequences_subsets;

import java.util.ArrayList;
import java.util.Collections;

public class SubSet {
    ArrayList<ArrayList<Integer>> subSetList = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        Collections.sort(A);
        ArrayList<Integer> curList = new ArrayList<>();
        getSubsets(A, 0, curList);
        return subSetList;
    }

    private void getSubsets(ArrayList<Integer> a, int index, ArrayList<Integer> curList) {
        //if (index == a.size())
            //return;
        subSetList.add(new ArrayList<>(curList));
        for (int i = index; i < a.size(); ++i) {
            curList.add(a.get(i));
            getSubsets(a, i + 1, curList);
            curList.remove(curList.size() - 1);
        }
    }
}
