public class main {
    public static void main(String[] args) throws InterruptedException {
//

        ExtendThread2  t1 = new ExtendThread2("Thread 1 - HR Database");
        ExtendThread2 t2 = new ExtendThread2("Thread 2 - Send Email");
        t1.start();
        t1.join();

        t2.start();

//
//        ImplementRunable2  t1 = new ImplementRunable2("Thread 1");
//        ImplementRunable2  t2 = new ImplementRunable2("Thread 2");
//        t1.start();

    }
    }

