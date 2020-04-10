package _30_day_challenge.week1.day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeBuySellStockTest {

    BestTimeBuySellStock bestTimeBuySellStock = new BestTimeBuySellStock();

    @Test
    void maxProfit_1() {
        int[] price = {7,1,5,3,6,4};
        assertEquals(7, bestTimeBuySellStock.maxProfit(price));
    }

    @Test
    void maxProfit_2() {
        int[] price = {1,2,3,4,5};
        assertEquals(4, bestTimeBuySellStock.maxProfit(price));
    }

    @Test
    void maxProfit_3() {
        int[] price = {7,6,4,3,1};
        assertEquals(0, bestTimeBuySellStock.maxProfit(price));
    }
}
