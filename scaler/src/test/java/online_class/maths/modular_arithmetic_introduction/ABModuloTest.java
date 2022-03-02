package online_class.maths.modular_arithmetic_introduction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ABModuloTest {
    ABModulo modulo = new ABModulo();

    @Test
    public void solveTest1(){
        assertEquals(modulo.solve(1, 2), 1);
    }

    @Test
    public void solveTest2(){
        assertEquals(modulo.solve(5, 10), 5);
    }

    @Test
    public void solveTest3(){
        assertEquals(modulo.solve(6816621, 8157697), 1341076);
    }

    @Test
    public void solveTest4(){
        assertEquals(modulo.solve(106978, 4487506), 4380528);
    }

    @Test
    public void solveTest5(){
        assertEquals(modulo.solve(8976271, 8016897), 959374);
    }

    @Test
    public void solveTest6(){
        assertEquals(modulo.solve(6267755, 5941927), 325828);
    }
}
