package callableAndFuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableExample3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Callable<Integer>> list  = new ArrayList<>();
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for(int i =0; i<10 ; i++){
            list.add(new CallableWorker(i));
        }
        Integer result = executor.invokeAny(list);
        System.out.println(result);
        executor.shutdown();


    }

}
