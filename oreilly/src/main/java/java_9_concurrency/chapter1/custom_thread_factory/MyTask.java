package java_9_concurrency.chapter1.custom_thread_factory;

import java.util.concurrent.TimeUnit;

public class MyTask implements Runnable {
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
