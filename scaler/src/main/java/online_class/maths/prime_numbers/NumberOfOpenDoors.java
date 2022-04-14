package online_class.maths.prime_numbers;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Problem Description
 * Given an integer A, which denotes the number of doors in a row numbered 1 to A. All the doors are closed initially.
 *
 * A person moves to and fro, changing the states of the doors as follows: the person opens a door that is already closed and closes a door that is already opened.
 *
 * In the first go, he/she alters the states of doors numbered 1, 2, 3, … , A.
 * In the second go, he/she alters the states of doors numbered 2, 4, 6 ….
 * In the third go, he/she alters the states of doors numbered 3, 6, 9 …
 * This continues till the A'th go in, which you alter the state of the door numbered A.
 *
 * Find and return the number of open doors at the end of the procedure.
 */

public class NumberOfOpenDoors {
    public int solve(int A) {
        ArrayList<Boolean> doorsStatus = new ArrayList<>(Collections.nCopies(A + 1, true));
        doorsStatus.set(0, false);
        int count = 0;
        for (int i = 2; i <= A; ++i) {
            for (int j = i; j <= A; j = j + i) {
                doorsStatus.set(j, !doorsStatus.get(j));
            }
        }
        for (boolean doorStat : doorsStatus) {
            if (doorStat)
                count++;
        }

        return count;
    }

    //On looking to some test case we can find that only doors are getting open when the door numbers is a perfect square .

    public int openDoors(int A) {
        int openCount = 0;
        for (long i = 1; i <= A; i = i * i) {
            openCount++;
            i = openCount + 1;
        }
        return openCount;
    }
}
