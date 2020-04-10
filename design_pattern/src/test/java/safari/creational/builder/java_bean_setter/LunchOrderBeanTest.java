package safari.creational.builder.java_bean_setter;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LunchOrderBeanTest {
    LunchOrderBean lunchOrder;

    @BeforeEach
    void before() {
        lunchOrder = new LunchOrderBean("Wheat", "Lettuce", "Mustard", "Ham");
    }

    @Test
    void getBread() {
        assertEquals(lunchOrder.getBread(), "Wheat");
    }

    @Test
    void setBread() {
        lunchOrder.setBread("White");
        assertEquals(lunchOrder.getBread(), "White");
    }

    @Test
    void getCondiments() {
        assertEquals(lunchOrder.getCondiments(), "Lettuce");
    }

    @Test
    void setCondiments() {
        lunchOrder.setCondiments("Tomato");
        assertEquals(lunchOrder.getCondiments(), "Tomato");
    }

    @Test
    void getDressing() {
        assertEquals(lunchOrder.getDressing(), "Mustard");
    }

    @Test
    void setDressing() {
        lunchOrder.setDressing("Cheese");
        assertEquals(lunchOrder.getDressing(), "Cheese");
    }

    @Test
    void getMeat() {
        assertEquals(lunchOrder.getMeat(), "Ham");
    }

    @Test
    void setMeat() {
        lunchOrder.setMeat("Chicken");
        assertEquals(lunchOrder.getMeat(), "Chicken");
    }
}
