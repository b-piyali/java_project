package online_class.maths;

/**
 * Problem Description
 * Given a number A, check if it is a magic number or not.
 * <p>
 * A number is said to be a magic number if the sum of its digits is
 * calculated till a single digit recursively by adding the sum of the digits
 * after every addition. If the single digit comes out to be 1, then the number is a magic number.
 */
public class IsMagic {
    public int solve(int A) {
        int num = A % 9;
        return num == 1 ? 1 : 0;
    }
}
