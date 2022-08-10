package classWork;

public class Thread_ extends Thread {

    Thread_(String threadName){
        this.setName(threadName);
    }

    public void run() {
        for(int i=1;i<=10;i++) {
            System.out.println(this.getName()+" : "+ i);
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Written By Yash");
        Thread_ t1 = new Thread_("child 1");
        Thread_ t2 = new Thread_("child 2");

        t1.start();
        t2.start();

        for(int i=1;i<=10;i++) {
            System.out.println("Main: "+i);
            Thread.sleep(1000);
        }
    }
}
