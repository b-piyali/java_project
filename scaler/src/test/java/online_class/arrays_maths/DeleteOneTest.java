package online_class.arrays_maths;

import online_class.maths.modular_arithmetic_introduction.DeleteOne;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DeleteOneTest {
    DeleteOne deleteOne;

    @BeforeEach
    void setup(){
        deleteOne = new DeleteOne();
    }

    @Test
    public void test1(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(12, 15, 18));
        int result = 6;
        assertEquals(result, deleteOne.solve(input));
    }

    @Test
    public void test2(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 15, 30));
        int result = 15;
        assertEquals(result, deleteOne.solve(input));
    }

    @Test
    public void test3(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 9, 6, 8, 3));
        int result = 3;
        assertEquals(result, deleteOne.solve(input));
    }
}
