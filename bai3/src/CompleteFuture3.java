import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompleteFuture3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Run a task specified by a Runnable Object asynchronously");
        CompletableFuture<String> future = CompletableFuture.supplyAsync(()->{
            System.out.println("It is running  a separate thread than the main thread.");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Complete!!";
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(()->{
            System.out.println("It is running  a separate thread than the main thread.");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Complete!!";
        });

        System.out.println("it is also running ....");
        /// Bock and wait for fute to complate;
        System.out.println("Result1: " + future.get());
        System.out.println("Result2: " + future2.get());
        System.out.println("This is done");

    }
}
