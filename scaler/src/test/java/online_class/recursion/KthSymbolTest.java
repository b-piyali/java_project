package online_class.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthSymbolTest {
    KthSymbol kthSymbol;

    @BeforeEach
    void setup() {
        kthSymbol = new KthSymbol();
    }

    @Test
    public void return5Test(){
        int row = 5;
        int pos =5;
        assertEquals(1, kthSymbol.solve(row, pos));
    }

    @Test
    public void return1Test(){
        int row = 2;
        int pos =1;
        assertEquals(0, kthSymbol.solve(row, pos));
    }

    @Test
    public void return2Test(){
        int row = 2;
        int pos =2;
        assertEquals(1, kthSymbol.solve(row, pos));
    }
}
