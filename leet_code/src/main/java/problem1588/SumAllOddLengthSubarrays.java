package problem1588;

public class SumAllOddLengthSubarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int len = arr.length;

        for (int i = 0; i < len; i++)
            sum += (((i + 1) * (len - i) + 1) / 2) * arr[i]; //even=(T/2)*a[i] odd=((T+1)/2)*a[i]

        return sum;
    }
}
