package java_9_concurrency.chapter1.priority_based_executor;

import java.util.concurrent.TimeUnit;

public class MyPriorityTask implements Runnable, Comparable<MyPriorityTask> {
    private int priority;
    private String name;

    public MyPriorityTask(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }

    public int getPriority() {
        return this.priority;
    }

    @Override
    public int compareTo(MyPriorityTask o) {
        return Integer.compare(o.getPriority(), this.priority);
    }

    @Override
    public void run() {
        System.out.printf("MyPriorityTask: %s Priority: %d \n", name, priority);
        try{
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
