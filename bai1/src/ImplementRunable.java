public class ImplementRunable implements  Runnable{
    private String nameThread;

    @Override
    public void run() {
        for(int i = 0; i<10; i++){
            System.out.println("name: "+this.nameThread + "---- count: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public ImplementRunable(String nameThread){
        this.nameThread = nameThread;
    }

    public static void main(String[] args) {
        ImplementRunable  runable= new ImplementRunable("r1");
        ImplementRunable  runable2= new ImplementRunable("r2");
        Thread t1 = new Thread(runable);
        Thread t2 = new Thread(runable2);
        t1.start();
        t2.start();

    }


}
