package problem997;

public class FindTownJudge {
    public int findJudge(int n, int[][] trust) {
        int[] count = new int[n + 1];

        for (int[] item : trust) {
            count[item[0]]--;
            count[item[1]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (count[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}
