public class HandeException {
//    public static void main(String[] args) {
//        System.out.println("==> Main thread running...");
//
//        Thread thread = new Thread(new WorkingThread());
//        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
//            @Override
//            public void uncaughtException(Thread t, Throwable e) {
//                System.out.println("#Thread: " + t);
//                System.out.println("#Thread exception message: " + e.getMessage());
//            }
//        });
//
//        thread.start();
//        System.out.println("==&amp;gt; Main thread end!!!");
//    }
public static void main(String[] args) {
    System.out.println("main thread is running....");
    Thread thread  = new Thread(new WorkingThread());
    Thread thread2  = new Thread(new WorkingThread());
    Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println();
            System.out.println("#Thread: " + t);
            System.out.println("#Thread exception message: " + e.getMessage());
        }
    });
    thread.start();
    thread2.start();
    System.out.println("==&amp;gt; Main thread end!!!");
}

}
