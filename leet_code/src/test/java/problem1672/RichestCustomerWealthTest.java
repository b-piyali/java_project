package problem1672;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RichestCustomerWealthTest {
    RichestCustomerWealth customerWealth = new RichestCustomerWealth();

    @Test
    public void maximumWealthTest1() {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        assertEquals(customerWealth.maximumWealth(accounts), 6);
    }

    @Test
    public void maximumWealthTest2() {
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        assertEquals(customerWealth.maximumWealth(accounts), 10);
    }
}
