package problem1672;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int colLen = accounts[0].length;
        for (int[] account : accounts) {
            int sum = 0;
            for (int j = 0; j < colLen; ++j) {
                sum += account[j];
            }
            maxWealth = Math.max(sum, maxWealth);
        }
        return maxWealth;
    }
}
