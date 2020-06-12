package june_challenge.week1;

import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScheduling {
    public int twoCitySchedCost(int[][] costs) {
        /*int N = costs.length/2;
        int[] refund = new int[N * 2];
        int minCost = 0, index = 0;
        for(int[] cost : costs){
            refund[index++] = cost[1] - cost[0];
            minCost += cost[0];
        }
        Arrays.sort(refund);
        for(int i = 0; i < N; i++){
            minCost += refund[i];
        }
        return minCost;*/

        Arrays.sort(costs, Comparator.comparingInt(o -> (o[0] - o[1])));
        int res = 0, i = 0, j = costs.length - 1;
        while (i < j) {
            res += costs[i][0];
            res += costs[j][1];
            i++;
            j--;
        }
        return res;
    }
}
