package problem1523;

public class CountOddNumbersIntervalRange {
    public int countOdds(int low, int high) {
        return (high - low) / 2 + ((low & 1) == 1 || (high & 1) == 1 ? 1 : 0);
    }
}
