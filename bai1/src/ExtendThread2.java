public class ExtendThread2 extends  Thread{
    private Thread t;
    private String threadName;

    public ExtendThread2(String name){
        this.threadName = name;
        System.out.println("Create thread name: "+name);
    }

    public void run(){
        System.out.println("Running thread name: "+threadName);
        for(int i =0; i<10; i++){
            System.out.println("Thread: "+threadName + " count: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("Exiting thread name:"+ threadName);
    }
        public void start(){
        System.out.println("Start: "+threadName);
        if(t==null){
            t = new Thread( this, threadName);
            t.start();
        }
    }

}
