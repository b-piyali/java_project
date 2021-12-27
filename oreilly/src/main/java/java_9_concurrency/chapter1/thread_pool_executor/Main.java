package java_9_concurrency.chapter1.thread_pool_executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        MyExecutor myExecutor = new MyExecutor(1, 8, 100, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<Runnable>());
        List<Future<String>> results = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            SleepTwoSecondTasks tasks = new SleepTwoSecondTasks();
            Future<String> result = myExecutor.submit(tasks);
            results.add(result);
        }

        for (int i = 0; i < 5; i++) {
            try {
                String result = results.get(i).get();
                System.out.printf("Main: Result for task %d: %s: ", i, result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        myExecutor.shutdown();

        for (int i = 5; i < 10; i++) {
            try {
                String result = results.get(i).get();
                System.out.printf("Main: Result for task %d: %s: \n", i, result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        try{
            myExecutor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main: End of execution....");
    }
}
