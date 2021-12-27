package java_9_concurrency.chapter1.thread_factory_executor;

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
