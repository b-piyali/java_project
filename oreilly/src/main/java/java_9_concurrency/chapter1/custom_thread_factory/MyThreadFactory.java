package java_9_concurrency.chapter1.custom_thread_factory;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class MyThreadFactory implements ThreadFactory {
    private AtomicInteger counter;
    private String prefix;

    public MyThreadFactory(String prefix) {
        this.prefix = prefix;
        this.counter = new AtomicInteger(1);
    }

    @Override
    public Thread newThread(Runnable r) {
        MyThread myThread = new MyThread(r, prefix + "-" + counter.getAndIncrement());
        return myThread;
    }
}
