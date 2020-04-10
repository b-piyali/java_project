package safari.creational.singleton.lazy_loading;

public class DbSingletonLazy {
    private static DbSingletonLazy INSTANCE = null;

    private DbSingletonLazy() {
    }

    public static DbSingletonLazy getInstance() {
        if (INSTANCE == null)
            INSTANCE = new DbSingletonLazy();
        return INSTANCE;
    }
}
