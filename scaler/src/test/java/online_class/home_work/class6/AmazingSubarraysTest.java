package online_class.home_work.class6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AmazingSubarraysTest {
    AmazingSubarrays subarrays = new AmazingSubarrays();

    @Test
    public void solveTest1(){
        String str ="ABEC";
        assertEquals(subarrays.solve(str), 6);
    }

    @Test
    public void solveTest2(){
        String str ="pGpEusuCSWEaPOJmamlFAnIBgAJGtcJaMPFTLfUfkQKXeymydQsdWCTyEFjFgbSmknAmKYFHopWceEyCSumTyAFwhrLqQXbWnXSn";
        assertEquals(subarrays.solve(str), 1244);
    }
}
