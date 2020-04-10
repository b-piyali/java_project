package _30_day_challenge.week1.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {

    @Test
    void isHappy_1() {
        HappyNumber happyNumber = new HappyNumber();
        assertEquals(true, happyNumber.isHappy(19));
    }

    @Test
    void isHappy_2() {
        HappyNumber happyNumber = new HappyNumber();
        assertEquals(false, happyNumber.isHappy(11));
    }

    @Test
    void isHappy_5() {
        HappyNumber happyNumber = new HappyNumber();
        assertEquals(false, happyNumber.isHappy(2));
    }

    @Test
    void isHappy_3() {
        HappyNumber happyNumber = new HappyNumber();
        assertEquals(true, happyNumber.isHappy(7));
    }

    @Test
    void isHappy_4() {
        HappyNumber happyNumber = new HappyNumber();
        assertEquals(false, happyNumber.isHappy(-7));
    }

    @Test
    void isHappy_6() {
        HappyNumber happyNumber = new HappyNumber();
        assertEquals(false, happyNumber.isHappy(4));
    }

    @Test
    void isHappy_7() {
        HappyNumber happyNumber = new HappyNumber();
        assertEquals(true, happyNumber.isHappy(1));
    }
}
