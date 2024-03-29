package java_9_concurrency.chapter1.priority_based_executor;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(4, 4, 1, TimeUnit.SECONDS, new PriorityBlockingQueue<Runnable>());

        for (int i = 0; i < 10; i++) {
            MyPriorityTask task = new MyPriorityTask(i, "Task" + i);
            executor.execute(task);
        }

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 10; i < 20; i++) {
            MyPriorityTask task = new MyPriorityTask(i, "Task" + i);
            executor.execute(task);
        }

        executor.shutdown();

        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main: End of execution....");
    }
}
