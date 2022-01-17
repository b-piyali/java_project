package online_class.home_work.class5;

import java.util.ArrayList;

public class ProductArrayPuzzle {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> productList = new ArrayList<>();
        int product = 1;
        for (int num : A) {
            product *= num;
        }
        for (int num : A) {
            productList.add(product / num);
        }
        return productList;
    }
}
