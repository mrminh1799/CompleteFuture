import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompleteFuture2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("run a task specified by runnable object asynchronously");
        CompletableFuture<Void> future = CompletableFuture.runAsync(()->{
            System.out.println("It is running  a separate thread than the main thread.");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Complete");
        });
        System.out.println("It is also running...");
        future.get();


        System.out.println("Done");
    }
}
