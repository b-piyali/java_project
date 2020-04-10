package safari.creational.singleton.threadsafe;

import org.junit.jupiter.api.Test;
import safari.creational.singleton.lazy_loading.DbSingletonLazy;

import static org.junit.jupiter.api.Assertions.*;

class DbSingletonThreadSafeTest {

    @Test
    void getInstance() {
        DbSingletonThreadSafe instance = DbSingletonThreadSafe.getInstance();
    }

    @Test
    void createOneInstance() {
        DbSingletonThreadSafe firstInstance = DbSingletonThreadSafe.getInstance();
        DbSingletonThreadSafe secondInstance = DbSingletonThreadSafe.getInstance();
        assertEquals(firstInstance, secondInstance, "Return different instance");
    }
}
