package java_9_concurrency.chapter1;

import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class MyExecutor extends ThreadPoolExecutor {
    private final ConcurrentHashMap<Runnable, Date> startTime;

    public MyExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
        startTime = new ConcurrentHashMap<>();
    }

    @Override
    public void shutdown() {
        System.out.println("MyExecutor: Going to shutdown...");
        System.out.println("MyExecutor: Executed Tasks: " + getCompletedTaskCount());
        System.out.println("MyExecutor: Running Tasks: " + getActiveCount());
        System.out.println("MyExecutor: Pending Tasks: " + getQueue().size());
        super.shutdown();
    }

    @Override
    public List<Runnable> shutdownNow() {
        System.out.println("MyExecutor: Going to shutdown...");
        System.out.println("MyExecutor: Executed Tasks: " + getCompletedTaskCount());
        System.out.println("MyExecutor: Running Tasks: " + getActiveCount());
        System.out.println("MyExecutor: Pending Tasks: " + getQueue().size());
        return super.shutdownNow();
    }

    @Override
    protected void beforeExecute(Thread t, Runnable r) {
        System.out.printf("MyExecutor: A task is begning.. %s : %s \n ", t.getName(), r.hashCode());
        startTime.put(r, new Date());
    }

    @Override
    protected void afterExecute(Runnable r, Throwable t) {
        Future<?> result = (Future<?>) r;
        try {
            System.out.println("************************");
            System.out.println("MyExecutor: A task is finishing...");
            System.out.println("MyExecutor: Result: " + result.get());
            Date startDate = startTime.remove(r);
            Date finishDate = new Date();
            long diff = finishDate.getTime() - startDate.getTime();
            System.out.println("MyExecutor: Duration: " + diff);
            System.out.println("************************");
        } catch (InterruptedException | ExecutionException e) {
            System.out.println(e.getMessage());
        }
    }
}
