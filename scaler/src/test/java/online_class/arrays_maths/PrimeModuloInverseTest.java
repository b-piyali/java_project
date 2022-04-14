package online_class.arrays_maths;

import online_class.maths.modular_arithmetic_introduction.PrimeModuloInverse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeModuloInverseTest {
    PrimeModuloInverse primeModuloInverse;

    @BeforeEach
    void setup() {
        primeModuloInverse = new PrimeModuloInverse();
    }

    @Test
    public void test1() {
        int A = 3, B = 5, result = 2;
        assertEquals(result, primeModuloInverse.solve(A, B));
    }

    @Test
    public void test2() {
        int A = 6, B = 23, result = 4;
        assertEquals(result, primeModuloInverse.solve(A, B));
    }
}
