package online_class.arrays_maths;

import java.util.ArrayList;

/**
 * Rearrange a given array so that Arr[i] becomes Arr[Arr[i]] with O(1) extra space.
 * <p>
 * Example:
 * <p>
 * Input : [1, 0]
 * Return : [0, 1]
 * Lets say N = size of the array. Then, following holds true :
 * <p>
 * All elements in the array are in the range [0, N-1]
 * N * N does not overflow for a signed integer
 */

public class RearrangeArray {
    public void arrange(ArrayList<Integer> a) {
        int len = a.size();

        for (int i = 0; i < len; ++i) {
            a.set(i, a.get(i) * len);
        }

        for (int i = 0; i < len; ++i) {
            int ind = a.get(i) / len;
            int val = a.get(ind) / len;
            a.set(i, a.get(i) + val);
        }

        for (int i = 0; i < len; ++i) {
            a.set(i, a.get(i) % len);
        }
    }
}
