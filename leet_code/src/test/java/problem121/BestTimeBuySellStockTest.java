package problem121;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeBuySellStockTest {
    BestTimeBuySellStock bestTimeBuySellStock = new BestTimeBuySellStock();

    @Test
    public void maxProfitTest1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(bestTimeBuySellStock.maxProfit(prices), 5);
    }

    @Test
    public void maxProfitTest2() {
        int[] prices = {7, 6, 4, 3, 1};
        assertEquals(bestTimeBuySellStock.maxProfit(prices), 0);
    }

    @Test
    public void maxProfitTest3() {
        int[] prices = {2, 4, 3, 1};
        assertEquals(bestTimeBuySellStock.maxProfit(prices), 2);
    }

    @Test
    public void maxProfitTest4() {
        int[] prices = {2,1,2,1,0,1,2};
        assertEquals(bestTimeBuySellStock.maxProfit(prices), 2);
    }
}
