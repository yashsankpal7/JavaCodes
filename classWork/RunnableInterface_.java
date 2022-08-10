package classWork;

public class RunnableInterface_ implements Runnable {

    Thread t1 = null;
    RunnableInterface_(String threadName){
        t1 = new Thread(this,threadName);
        t1.start();
    }
    @Override
    public void run() {
        for(int i=1;i<=10;i++) {
            System.out.println(t1.getName()+" : "+ i);
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        System.out.println("Written By Yash");
        RunnableInterface_ t1 = new RunnableInterface_("child 1");
        RunnableInterface_ t2 = new RunnableInterface_("child 2");

        for(int i=1;i<=10;i++) {
            System.out.println("Main: "+i);
            Thread.sleep(1000);
        }
    }
}
