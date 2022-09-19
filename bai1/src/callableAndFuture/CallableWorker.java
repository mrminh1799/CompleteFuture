package callableAndFuture;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableWorker implements Callable<Integer> {

//    private int num;
//    private Random ran;
//
//    public CallableWorker(int num) {
//        this.num = num;
//        this.ran = new Random();
//    }
//
//    public Integer call() throws Exception {
//        Thread.sleep(ran.nextInt(10) * 1000);
//        int result = num * num;
//        System.out.println("Complete " + num);
//        return result;
//    }
    private int num;
    private Random run;
    public CallableWorker(Integer num){
        this.num = num;
        run = new Random();
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(run.nextInt( 10)*1000);
        int result = num* num;
        System.out.println("Complete "+num);
        return result;
    }
}
