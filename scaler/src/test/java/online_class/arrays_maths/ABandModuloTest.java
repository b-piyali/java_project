package online_class.arrays_maths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ABandModuloTest {
    ABandModulo aBandModulo;

    @BeforeEach
    void setup() {
        aBandModulo = new ABandModulo();
    }

    @Test
    public void test1() {
        int A = 1, B = 2, result = 1;
        assertEquals(result, aBandModulo.solve(A, B));
    }

    @Test
    public void test2() {
        int A = 5, B = 10, result = 5;
        assertEquals(result, aBandModulo.solve(A, B));
    }
}
