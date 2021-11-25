package java.advance;

public class Singleton {
    public String str;
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    static Singleton getSingleInstance() {
        return INSTANCE;
    }
}
