package online_class.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class BeggarsOutsideTemple {
    public ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
        //initializing a list of capacity A with zero values
        ArrayList<Integer> output = new ArrayList<>(Collections.nCopies(A, 0));

        for (ArrayList<Integer> devotee : B) {//iterating each devotee to get the amount donated
            int start = devotee.get(0) - 1; // getting starting beggar number
            int end = devotee.get(1); // getting ending +1 beggar number
            int amount = devotee.get(2); // getting amount donated to beggar

            output.set(start, (output.get(start) + amount)); // setting values to starting beggar
            if ((end) < A)
                output.set(end, (output.get(end) - amount)); // setting values to ending+1 beggar
        }

        for (int i = 1; i < A; i++) { // calculating amount of each beggar got using prefixSum
            output.set(i, (output.get(i) + output.get(i - 1)));
        }

        return output;
    }
}
