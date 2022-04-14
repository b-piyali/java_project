package online_class.arrays;

import java.util.ArrayList;

/**
 * Problem Description
 * Given an array of integers A of size N that is a permutation of [0, 1, 2, ..., (N-1)],
 * if we split the array into some number of "chunks" (partitions), and individually sort each chunk.
 * After concatenating them in order of splitting, the result equals the sorted array.
 * <p>
 * What is the most number of chunks we could have made?
 */

public class MaxChunksToMakeSorted {
    public int solve(ArrayList<Integer> A) {
        int count = 0;
        int maxChunk = -1;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) > maxChunk)
                maxChunk = A.get(i);
            if (maxChunk == i)
                count++;
        }
        return count;
    }
}
