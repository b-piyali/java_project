package _30_day_challenge.week2.day12;

import java.util.Arrays;
import java.util.Stack;

/**
 * We have a collection of stones, each stone has a positive integer weight.
 * <p>
 * Each turn, we choose the two heaviest stones and smash them together.
 * Suppose the stones have weights x and y with x <= y.  The result of this smash is:
 * <p>
 * If x == y, both stones are totally destroyed;
 * If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
 * At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)
 * <p>
 * <p>
 * <p>
 * Example 1:
 * Input: [2,7,4,1,8,1]
 * Output: 1
 * Explanation:
 * We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
 * we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
 * we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
 * we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of last stone.
 * <p>
 * Note:
 * <p>
 * 1 <= stones.length <= 30
 * 1 <= stones[i] <= 1000
 */
public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        int stoneWeight = 0;
        if (stones == null)
            return -1;
        if (stones.length == 1)
            return stones[0];
        if (stones.length == 2)
            return Math.abs(stones[0] - stones[1]);


        Arrays.sort(stones);
        Stack<Integer> stoneStack = new Stack<>();
        for (int stone : stones) {
            stoneStack.push(stone);
        }
        int y = stoneStack.pop();
        int x = stoneStack.pop();
        if(x!=y)
            stoneStack.push(y-x);
        return stoneWeight;
    }

/*    private Stack<Integer> calculateWeight(Stack<Integer> stoneStack){

    }*/
}
