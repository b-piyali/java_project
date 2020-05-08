package ds.arraylist.javaarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<ArrayList<Integer>> lists = new ArrayList<>();

        for(int i=0; i<n; i++){
            ArrayList<Integer> list = new ArrayList<>();
            int d = sc.nextInt();
            for(int j=0; j<d; j++){
                list.add(sc.nextInt());
            }
            lists.add(list);
        }

        int q = sc.nextInt();
        for(int i=0; i<q; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            ArrayList<Integer> list = lists.get(x-1);
            if (y <= list.size()) {
                System.out.println(list.get(y-1));
            } else {
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}
