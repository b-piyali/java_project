package show_primer;

import java.util.stream.IntStream;

public class SumEvens {
    public int solve(int A) {
        int sum = 0;
        /*for (int i = 1; i <= A; i++) {
            if (i % 2 == 0)
                sum += i;
        }*/
        sum = IntStream.range(1, A + 1).filter(i -> i % 2 == 0).reduce(0, Integer::sum);;
        return sum;
    }
}
