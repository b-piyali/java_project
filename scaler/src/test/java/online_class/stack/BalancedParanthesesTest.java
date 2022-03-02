package online_class.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedParanthesesTest {
    BalancedParantheses balancedParantheses;

    @BeforeEach
    void setup(){
        balancedParantheses = new BalancedParantheses();
    }

    @Test
    public void notBalancedTest(){
        String str="))";
        assertEquals(0, balancedParantheses.solve(str));
    }

    @Test
    public void balancedTest(){
        String str="(()())";
        assertEquals(1, balancedParantheses.solve(str));
    }

    @Test
    public void notBalancedTest2(){
        String str="(()";
        assertEquals(0, balancedParantheses.solve(str));
    }

    @Test
    public void notBalancedTest3(){
        String str="))((()(())";
        assertEquals(0, balancedParantheses.solve(str));
    }
}
