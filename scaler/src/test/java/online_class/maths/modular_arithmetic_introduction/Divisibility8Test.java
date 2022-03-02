package online_class.maths.modular_arithmetic_introduction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Divisibility8Test {
    Divisibility8 divisibility8 = new Divisibility8();

    @Test
    public void solveTest1() {
        assertEquals(divisibility8.solve("16"), 1);
    }

    @Test
    public void solveTest2() {
        assertEquals(divisibility8.solve("123"), 0);
    }

    @Test
    public void solveTest3() {
        assertEquals(divisibility8.solve("8"), 1);
    }
}
