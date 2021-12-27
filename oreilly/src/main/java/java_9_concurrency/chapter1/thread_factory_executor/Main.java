package java_9_concurrency.chapter1.thread_factory_executor;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        MyThreadFactory threadFactory = new MyThreadFactory("MyThreadFactory");
        ExecutorService executor = Executors.newCachedThreadPool(threadFactory);

        MyTask task = new MyTask();
        executor.submit(task);
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);

        System.out.println("Main: End....");
    }

    public int solve(ArrayList<Integer> A, int B) {
        A.sort(Integer::compareTo);
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            int rem = B - A.get(i);
            for (int j = A.size() - 1; j > i; j--) {
                if (A.get(j) < rem) {
                    break;
                }
                if (A.get(j) == rem)
                    count++;
            }
        }
        return count;
    }

    public int solve(ArrayList<Integer> A) {
        A.sort(Integer::compareTo);
        int len = A.size();
        int maxIndex = len - 1;
        int odd = Integer.MIN_VALUE;
        int even = Integer.MAX_VALUE;
        boolean hasOdd = false;
        boolean hasEven = false;
        for (int i = 0; i < len; i++) {
            if (!hasOdd && (A.get(i) % 2 != 0)) {
                odd = A.get(i);
                hasOdd = true;
            }
            if(!hasEven && (A.get(maxIndex -i) % 2 == 0)){
                even = A.get(maxIndex -i);
                hasEven = true;
            }
            if(hasEven && hasOdd){
                break;
            }
        }
        return even - odd;
    }

    /*public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        A.sort(Integer::compareTo);
        A.sort(Integer::compareTo);
        int i=0;
        int j=0;
       // while(i)

    }*/
}
