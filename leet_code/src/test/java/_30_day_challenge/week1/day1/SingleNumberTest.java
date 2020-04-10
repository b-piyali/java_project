package _30_day_challenge.week1.day1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleNumberTest {
    private SingleNumber singleNumber = new SingleNumber();

   @Test
    void singleNumber_1() {
        int[] nums = {4, 1, 2, 1, 2};
        assertEquals(4, singleNumber.singleNumber(nums));
    }

    @Test
    void singleNumber_2() {
        int[] nums = {2, 2, 1};
        assertEquals(1, singleNumber.singleNumber(nums));
    }
}
