package ass_class_2;

public class class_runnableThread implements Runnable {

    Thread t1 = null;
    class_runnableThread(String threadName){
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
        class_runnableThread t1 = new class_runnableThread("child 1");
        class_runnableThread t2 = new class_runnableThread("child 2");

        for(int i=1;i<=10;i++) {
            System.out.println("Main: "+i);
            Thread.sleep(1000);
        }
    }
}
