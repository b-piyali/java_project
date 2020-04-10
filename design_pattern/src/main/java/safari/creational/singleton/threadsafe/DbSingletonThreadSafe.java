package safari.creational.singleton.threadsafe;

public class DbSingletonThreadSafe {
    private static volatile DbSingletonThreadSafe instance = null;

    private DbSingletonThreadSafe() {
        if (instance != null)
            throw new RuntimeException("use getInstance() method to create.");
    }

    public static DbSingletonThreadSafe getInstance() {
        if (instance == null)
            synchronized (DbSingletonThreadSafe.class) {
                if (instance == null) {
                    instance = new DbSingletonThreadSafe();
                }
            }
        return instance;
    }
}
