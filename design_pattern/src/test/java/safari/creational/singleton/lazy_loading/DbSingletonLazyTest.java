package safari.creational.singleton.lazy_loading;

import org.junit.jupiter.api.Test;
import safari.creational.singleton.lazy_loading.DbSingletonLazy;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DbSingletonLazyTest {

    @Test
    void getInstance() {
        DbSingletonLazy instance = DbSingletonLazy.getInstance();
    }

    @Test
    void createOneInstance() {
        DbSingletonLazy firstInstance = DbSingletonLazy.getInstance();
        DbSingletonLazy secondInstance = DbSingletonLazy.getInstance();
        assertEquals(firstInstance, secondInstance, "Return different instance");
    }
}
