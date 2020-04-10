package safari.creational.singleton.static_singleton;

import org.junit.jupiter.api.Test;
import safari.creational.singleton.static_singleton.DbSingleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DbSingletonTest {
    @Test
    void getInstance() {
        DbSingleton dbSingleton = DbSingleton.getInstance();
    }

    @Test
    void createOneInstance() {
        DbSingleton firstInstance = DbSingleton.getInstance();
        DbSingleton secondInstance = DbSingleton.getInstance();
        assertEquals(firstInstance, secondInstance, "Return different instance");
    }
}
