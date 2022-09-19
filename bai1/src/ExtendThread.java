
public class ExtendThread extends Thread{
    private String nameThread ;

    @Override
    public void run(){
        for(int i =0; i<10; i++){
            System.out.println("name thread: " + this.nameThread +"--- count: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public ExtendThread(String nameThread) {
        super(nameThread);
    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Toi dang hoc da luong");
        ExtendThread e = new ExtendThread("thread 1");

        ExtendThread e1 = new ExtendThread("thread 2");

        e.start();
        e.join();
        e1.start();
    }
}

