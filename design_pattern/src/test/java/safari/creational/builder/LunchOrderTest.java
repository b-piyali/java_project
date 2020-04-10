package safari.creational.builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LunchOrderTest {
    LunchOrder lunchOrder;

    @BeforeEach
    void before() {
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("Wheat").condiments("Olive").meat("Turkey").dressing("Meyo");
        lunchOrder = builder.build();
    }

    @Test
    void getBread() {
        assertEquals("Wheat", lunchOrder.getBread());
    }

    @Test
    void getCondiments() {
        assertEquals("Olive", lunchOrder.getCondiments());
    }

    @Test
    void getDressing() {
        assertEquals("Meyo", lunchOrder.getDressing());
    }

    @Test
    void getMeat() {
        assertEquals("Turkey", lunchOrder.getMeat());
    }
}
