import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompleteFuture1 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        System.out.println("Manually  complete");
        completableFuture.complete(computeSomeThing());
        System.out.println("Get result");
        System.out.println(completableFuture.get());

    }

    public static String computeSomeThing() throws InterruptedException {
        System.out.println("Compute some thing .....");
        Thread.sleep(3000);
        return "Future's result";
    }
}
