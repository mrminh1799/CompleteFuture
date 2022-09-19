package callableAndFuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableExample4 {
    public static void main(String[] args) {
        List<Callable<Integer>> callble = new ArrayList<>();
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            callble.add(new CallableWorker(i));
        }

        List<Future<Integer>> listFuture;
        try {
            listFuture = executor.invokeAll(callble);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        int sum =0;

        System.out.println(sum);
    }
}
