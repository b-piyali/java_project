package problem389;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheDifferenceTest {
    FindTheDifference difference = new FindTheDifference();

    @Test
    public void findTheDifferenceTest1(){
        assertEquals('e', difference.findTheDifference("abcd","cabed"));
    }

    @Test
    public void findTheDifferenceTest2(){
        assertEquals('d', difference.findTheDifference("sxyzre","sxyzrde"));
    }
}
