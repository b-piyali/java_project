package interviewPreparationKit.months_preparation_kit.week1;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        if (Objects.nonNull(arr)) {
            double len = arr.size();
            int pCount = 0;
            int nCount = 0;
            int zCount = 0;

            for (int num : arr) {
                if (num == 0)
                    zCount++;
                else if (num > 0)
                    pCount++;
                else
                    nCount++;
            }
            System.out.format("%.6f \n", pCount / len);
            System.out.format("%.6f \n", nCount / len);
            System.out.format("%.6f", zCount / len);
        }
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(-4, 3, -9, 0, 4, 1);
        plusMinus(arr);
    }
}
