import java.util.Timer;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompleteFuture5ThenApply {
    public static  final  int NUMBER =5;

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // create a complete future
        CompletableFuture<Integer> time2 = CompletableFuture.supplyAsync(()->{
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return MathUnitl.times(NUMBER, 1 );
        }) ;

        // gan 1 callback de Future su dung

        CompletableFuture<Boolean> greetingFuture = time2.thenApply(n->{
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return  MathUnitl.squred(n);
        }).thenApply(n ->{
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return MathUnitl.isEvent(n);
        });

        System.out.println(greetingFuture.get());
    }

}


class MathUnitl{
    public  static int times (int number, int time){
        return number * time;
    }

    public static int  squred (int number){
        return  number* number;
    }

    public static boolean isEvent (int number){
        return  number %2 ==0;
    }
}