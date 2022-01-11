package online_class.assignments.class1;

import java.util.Scanner;

public class SquareRootNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
        }
    }

    public int solve(int A) {
        for (int i = 1; i <= Math.sqrt(A); i++) {
            if (i * i == A)
                return i;
        }
        return -1;
    }
}
