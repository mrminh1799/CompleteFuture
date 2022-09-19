package callableAndFuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableExample2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Future<Integer>> list = new ArrayList<>();
        Callable<Integer> callable;
        ExecutorService executer = Executors.newFixedThreadPool(10);
        Future<Integer> future;
        for(int i =0; i<10; i++){
            callable = new CallableWorker(i);
            future = executer.submit(callable);
            list.add(future);
        }
        for (Future<Integer> x: list){
            // print the return value of Future, notice the output delay in console
            // because Future.get() waits for task to get completed
//            int result = f.get(GET_TIME_OUT, TimeUnit.SECONDS);
//            // Throw TimeoutException if the task execute over 7s
//            sum += result;
//            System.out.println("Result: " + result);
//            System.out.println("Is completed? : " + f.isDone());
//            System.out.println("Is canceled? : " + f.isCancelled());

            try {
                int result = x.get(1, TimeUnit.SECONDS);

                System.out.println("Result: "+ result);
                System.out.println("Is complete: "+ x.isDone());
                System.out.println("Is cancel: "+x.isCancelled());

            } catch (TimeoutException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
