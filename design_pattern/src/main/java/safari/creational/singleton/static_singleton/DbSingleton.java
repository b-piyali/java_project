package safari.creational.singleton.static_singleton;

public class DbSingleton {
    private static final DbSingleton INSTANCE = new DbSingleton();

    private DbSingleton() {
    }

    public static DbSingleton getInstance() {
        return INSTANCE;
    }
}
