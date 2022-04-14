package online_class.maths.modular_arithmetic_introduction;

import java.util.ArrayList;

/**
 * Problem Description
 * There are N players, each with strength A[i]. when player i attack player j, player j strength reduces to max(0, A[j]-A[i]). When a player's strength reaches zero, it loses the game, and the game continues in the same manner among other players until only 1 survivor remains.
 *
 * Can you tell the minimum health last surviving person can have?
 */

public class Pubg {
    public int solve(ArrayList<Integer> A) {
        int gcd = 0;
        for (int num : A) {
            gcd = gcd(gcd, num);
        }
        return gcd;
    }

    private int gcd(int A, int B) {
        if (B == 0) {
            return A;
        }
        return gcd(B, A % B);
    }
}
