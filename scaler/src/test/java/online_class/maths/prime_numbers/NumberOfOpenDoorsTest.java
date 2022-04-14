package online_class.maths.prime_numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfOpenDoorsTest {
    NumberOfOpenDoors numberOfOpenDoors;

    @BeforeEach
    void setup() {
        numberOfOpenDoors = new NumberOfOpenDoors();
    }

    @Test
    public void test1(){
        int input = 5;
        int output = 2;
        assertEquals(output, numberOfOpenDoors.solve(input));
    }

    @Test
    public void test2(){
        int input = 6;
        int output = 2;
        assertEquals(output, numberOfOpenDoors.solve(input));
    }

    @Test
    public void test3(){
        int input = 10;
        int output = 3;
        assertEquals(output, numberOfOpenDoors.solve(input));
    }

    @Test
    public void test4(){
        int input = 360614;
        int output = 600;
        assertEquals(output, numberOfOpenDoors.solve(input));
    }

    @Test
    public void test5(){
        int input = 381302;
        int output = 617;
        assertEquals(output, numberOfOpenDoors.solve(input));
    }
}
