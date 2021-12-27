package java_9_concurrency.chapter1.thread_factory_executor;

import java.util.Date;

public class MyThread extends Thread {
    private final Date creationDate;
    private Date startDate;
    private Date finishDate;

    public MyThread(Runnable target, String name) {
        super(target, name);
        this.creationDate = new Date();
    }

    @Override
    public void run() {
        setStartDate();
        super.run();
        setFinishDate();
    }

    private synchronized void setFinishDate() {
        this.finishDate = new Date();
    }

    private synchronized void setStartDate() {
        this.startDate = new Date();
    }

    private synchronized long getExecutionTime() {
        return finishDate.getTime() - startDate.getTime();
    }

    @Override
    public String toString() {
        return "MyThread{" +
                " Thread: " + getName() +
                " Creation Date: " + creationDate +
                ", Running Time: " + getExecutionTime() +
                '}';
    }
}
