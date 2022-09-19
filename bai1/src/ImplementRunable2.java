public class ImplementRunable2 implements  Runnable{
    Thread t;
    String name;

    ImplementRunable2(String name){
        this.name = name;
        System.out.println("Create thread: " +name);

    }

    @Override
    public void run() {
        System.out.println("Running thread name: "+name);
        for(int  i =0; i<10; i++){
            System.out.println("Thread name" +name +":  "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("End thread: "+ name);
    }

    public void start(){
        System.out.println("Start thread: "+ name);
        if(t == null){
            t = new Thread(this);
            t.start();
        }
    }
}
