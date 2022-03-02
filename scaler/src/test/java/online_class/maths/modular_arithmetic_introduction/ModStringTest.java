package online_class.maths.modular_arithmetic_introduction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModStringTest {
    ModString modString = new ModString();

    @Test
    public void findModTest1(){
        assertEquals(modString.findMod("143", 2), 1);
    }

    @Test
    public void findModTest2(){
        assertEquals(modString.findMod("43535321", 47), 20);
    }

    @Test
    public void findModTest3(){
        assertEquals(modString.findMod("6562800446546751053033681283622332585949169375825307419010747907087102529693988502714663897293527240363734284937813181135000995192664742291904645171438423695200374401117403", 36173), 33132);
    }
}
