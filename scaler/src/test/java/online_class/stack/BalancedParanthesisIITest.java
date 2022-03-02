package online_class.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BalancedParanthesisIITest {
    BalancedParanthesisII balancedParanthesis;

    @BeforeEach
    void setup(){
        balancedParanthesis = new BalancedParanthesisII();
    }

    @Test
    public void matchedParanthesis1(){
        String str = "{([])}";
        assertEquals(1, balancedParanthesis.solve(str));
    }

    @Test
    public void matchedParanthesis2(){
        String str = "()[]";
        assertEquals(1, balancedParanthesis.solve(str));
    }

    @Test
    public void notMatchedParanthesis1(){
        String str = "(){";
        assertEquals(0, balancedParanthesis.solve(str));
    }
}
