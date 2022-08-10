package ass_class_2;


public class class_thread extends Thread {
    class_thread(String threadName){
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
        class_thread t1 = new class_thread("child 1");
        class_thread t2 = new class_thread("child 2");

        t1.start();
        t2.start();

        for(int i=1;i<=10;i++) {
            System.out.println("Main: "+i);
            Thread.sleep(1000);
        }
    }
}
