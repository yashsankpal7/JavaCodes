

import classWork.Print;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;
import java.time.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

interface  I{
    public void abc();
}

interface  Ix {
    public void abc();
}

interface Demo{
    public static void main(String[] args){
        int x=0;
        I i1 = ()->System.out.println("Lambda expression 1");
//                    System.out.println("Lambda expression 2");
//                    System.out.println("Lambda expression 3");

        i1.abc();
    }
}


class X{
    void tmp(){ System.out.println("X");}
}
class y extends X{
    void tmp(){

    }
    public static void main(String[] args){
        y x = new y();

        x.tmp();

    }
}

//predicate

interface predicate{
    public static void main(String[] args){
        int arr[] = { 11,22,33,44,55,66,77,88,99};

        Predicate<Integer> p1 = (x) -> x%2 == 0;
        Predicate<Integer> p2 = (x) -> x>50;
        
        process(p1,arr);
        process(p1.negate(),arr);

        process(p2,arr);
        process(p2.negate(),arr);

        process(p2.and(p1),arr);
        process(p2.and(p1.negate()),arr);

        process(p2.negate().or(p1),arr);
        process(p2.negate().or(p1.negate()),arr);
    }

    public static void process(Predicate<Integer> p,int arr[]){

        for(int x:arr){
            if(p.test(x)) System.out.println(x);
        }
        System.out.println("--");
    }
}


// js in java

interface engine{
    public static void main(String[] args){
        try{
            ScriptEngineManager mgr = new ScriptEngineManager();

            ScriptEngine engine = mgr.getEngineByName("JavaScript");

            engine.eval("print('Hello from Java Program')");
            engine.eval(new FileReader("abc.js"));
        }catch (Exception e){ System.out.println(e);}
    }
}

interface engine2{
    public static void main(String[] args){
        try{
            ScriptEngineManager mgr = new ScriptEngineManager();

            ScriptEngine engine = mgr.getEngineByName("JavaScript");

            engine.eval("print('Hello from Java Program')");
            engine.eval(new FileReader("abc.js"));

            engine.eval(new FileReader("xyz.js"));

            Invocable inv = (Invocable)  engine;

            inv.invokeFunction("abc");
            inv.invokeFunction("addNum",11,22);
            String result = (String) inv.invokeFunction("greet",args[0],args[1]);
            System.out.println(result);
        }catch (Exception e){ System.out.println(e);}
    }
}

//thread
class Demo_thread{
    Demo_thread(){
        for (int i=0;i<10;i++)Print.Print("From Demo() constructor: "+i);
    }

    public static void abc(){
        for (int i=0;i<10;i++)Print.Print("From abc() static method: "+i);
    }

    public void xyz(){
        for (int i=0;i<10;i++)Print.Print("From xyz() object method: "+i);
    }
}

class Demo_run{
    public static void main(String[] args){
        Thread t1 = new Thread(Demo_thread::abc);
        t1.start();

        Thread t2 = new Thread(new Demo_thread()::xyz);
        t2.start();

        Thread t3 = new Thread(Demo_thread::new);
        t3.start();
        for (int i=0;i<100;i++) System.out.println("From main : "+i);
    }
}


//lose coupling
//method referencing
//interface  I{
//    public void abc();
//}

interface J{
    public String xyz(String s);
}

interface K{
    public Demo_reference getObject(String s);
}

class Demo_reference{
    Demo_reference(){
        Print.Print("This is from Demo() constructor");
    }
    Demo_reference(String name){
        Print.Print("Created object of Demo Mr./Ms. "+name);
    }
    public static void classMethod(){
        Print.Print("Hello from classMethod()");
    }
    public void instanceMethod(){
        Print.Print("Hello from instanceMethod");
    }
    public String greet(String name){
        Print.Print("Welcome ! "+name);
        return "Have a good day";
    }
}

class Demo_reference_{

    public static void main(String[] args){
        I it1 = Demo_reference::classMethod;
        it1.abc();

        it1 = Demo_reference::new;
        it1.abc();

        J j1 = new Demo_reference()::greet;
        String str = j1.xyz("Ramesh");
        Print.Print(str);

        K k1 = Demo_reference::new;

        Demo_reference d1 = k1.getObject("Naveen");
        Demo_reference d2 = k1.getObject("Paveen");
        Demo_reference d3 = k1.getObject("Saveen");
        Demo_reference d4 = k1.getObject("Taveen");

        Print.Print(d1.hashCode());
        Print.Print(d2.hashCode());
        Print.Print(d3.hashCode());
        Print.Print(d4.hashCode());
    }


}

//Optional API

class Demo_Optional{
    public static void main(String[] args){
        Integer i1 = 10;
        Integer i2 = 30;

        Optional<Integer> o1 = Optional.ofNullable(i1);
        Optional<Integer> o2 = Optional.ofNullable(i2);

        add(o1,o2);
    }

    public static void add(Optional<Integer> a,Optional<Integer> b){
        Integer i1 = a.orElse(0);
        Integer i2 = b.orElse(0);

        Print.Print(i1+i2);
    }
}


//forEach

class Demo_forEach{
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(11, 22, 33, 44, 55);

        for (int i = 0; i < lst.size(); i++) {
            Print.Print(lst.get(i));
        }

        Print.Print("--");

        Iterator it = lst.iterator();

        while (it.hasNext()){
            Print.Print(it.next());
        }

        Print.Print("--");

        for (int x: lst) Print.Print(x);

        Print.Print("--");

        lst.forEach(x->Print.Print(x));

        Print.Print("--");

        lst.forEach(Print::Print);
    }
}

class Cons implements Consumer<Integer>{
    public void accept(Integer i){
        Print.Print("From Cons class : "+i);
    }
}

class CosumerInterfaceExample{
    public static void printMessage(String name){
        Print.Print("From printMessage : "+name);
    }
    public static void printValue(int val){
        Print.Print("From printValue : "+val);
    }
}

class Demo_Consumer{
    public static void main(String[] args){

        List<Integer> list = Arrays.asList(11,22,33,44,55);
        List<String> list2 = Arrays.asList("Sita","Geeta","Neeta");

        list.forEach(Print::Print);

        list.forEach(new Cons());

        Consumer<String> c1 = CosumerInterfaceExample::printMessage;

        c1.accept("Rajesh");

        list2.forEach(CosumerInterfaceExample::printMessage);
        list.forEach(CosumerInterfaceExample::printValue);
    }
}

// Date time APi

class Demo_date_time{
    public static void main(String[] args){
        LocalDate d1 = LocalDate.now();
        Print.Print(d1);

        d1 = LocalDate.of(1983, Month.APRIL,24);
        Print.Print(d1);

        LocalTime t1 = LocalTime.now();
        Print.Print(t1);

        LocalDateTime dt1 = LocalDateTime.now();
        Print.Print(dt1);

        Set s = ZoneId.getAvailableZoneIds();

        s.forEach(Print::Print);

        LocalTime t2 = LocalTime.now(ZoneId.of("Europe/London"));
        Print.Print(t2);

        Print.Print(d1.plusMonths(6));
        Print.Print(d1.minusMonths(3));
    }
}


//stream api

class Demo_stream{
    public static void main(String[] args){
        List<Integer> ls = new ArrayList<>();

        ls.add(11);
        ls.add(10);
        ls.add(22);
        ls.add(13);
        ls.add(51);
        ls.add(61);
        ls.add(21);
        ls.add(51);
        ls.add(91);
        ls.add(14);
        ls.add(12);
        ls.add(31);
        ls.add(87);

        System.out.println(ls);

        List l1 = ls.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(l1);

        List l2 = ls.stream().filter(x->x%2==1).collect(Collectors.toList());
        System.out.println(l2);

        List l3 = ls.stream().map(x->x+x).collect(Collectors.toList());
        System.out.println(l3);


        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);

        IntStream is = IntStream.rangeClosed(20,30);
        is.limit(5).skip(2).forEach(System.out::println);

//        List<Integer> ls1 = is.boxed().collect(Collectors.toList());

        OptionalInt result1 = IntStream.rangeClosed(1,10).reduce((x, y)->x+y);
        System.out.println(result1);

        int result2 = Arrays.asList(1,2,3).stream().reduce(10,(a,b)->a+b);
        System.out.println(result2);

        int result3 = Arrays.asList(1,2,3).stream().reduce(10,(a,b)->a+b,(a,b)->a+b);
        System.out.println(result3);

        int result4 = Arrays.asList(1,2,3).parallelStream().reduce(10,(a,b)->a+b,(a,b)->a+b);
        System.out.println(result4);

        IntSummaryStatistics stats = IntStream.rangeClosed(1,100).summaryStatistics();

        System.out.println(stats);
        System.out.println(stats.getMin());
        System.out.println(stats.getMax());
        System.out.println(stats.getCount());
        System.out.println(stats.getAverage());
        System.out.println(stats.getSum());
    }
}


class Demo_map{
    public static void main(String[] args){
        Map<Integer,String> obj = new TreeMap<>();

        obj.put(111,"Rajesh");
        obj.put(222,"Rakesh");
        obj.put(333,"Ramesh");
        obj.put(444,"Ragesh");
        obj.put(555,"Ralesh");
        obj.put(666,"Rasesh");

        Set s = obj.entrySet();

        Iterator i = s.iterator();

        while (i.hasNext()){
            Map.Entry me = (Map.Entry) i.next();

            System.out.println("\nID : "+me.getKey());
            System.out.println("Name : "+me.getValue());
        }

        obj.entrySet().stream().map(Map.Entry::getKey).forEach(System.out::println);
        obj.entrySet().stream().map(Map.Entry::getValue).forEach(System.out::println);

        Print.Print("--");

        obj.entrySet().stream().filter(me->me.getKey()>300).map(Map.Entry::getValue).forEach(System.out::println);

        List<Integer>  l1 = Arrays.asList(1,2,3);
        List<Integer>  l2 = Arrays.asList(4,5,6);
        List<Integer>  l3 = Arrays.asList(7,8,9);

        List<List<Integer>> list = Arrays.asList(l1,l2,l3);

        System.out.println(list);

        List<Integer> result = list.stream().flatMap(lst->lst.stream()).map(x->x+x).collect(Collectors.toList());
        System.out.println(result);
    }
}


class Emp{

    String name,designation,gender;
    int age;
    double salary;
    Emp(String name,String designation,String gender,int age,double salary){
        this.name = name;
        this.designation = designation;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

class Demo_Map_stream{


    public static void main(String[] args){
        List<Emp> ls = new ArrayList<Emp>();

        ls.add(new Emp("Yash","Programmer","Male",25,900000));
        ls.add(new Emp("Abdul","Tester","Male",21,700000));
        ls.add(new Emp("Yogesh","Programmer","Male",33,600000));
        ls.add(new Emp("Advait","Tester","Male",31,600000));
        ls.add(new Emp("Yogini","Tester","Female",29,500000));
        ls.add(new Emp("Roshni","Tester","Female",22,600000));

        Map<Boolean,List<Emp>> m1 = ls.stream().collect(Collectors.partitioningBy(e->e.designation.equals("Manager")));
        System.out.println(m1);

        Map<Boolean,Long> m2 = ls.stream().collect(Collectors.partitioningBy(e->e.designation.equals("Manager"),Collectors.counting()));
        System.out.println(m2);

        Map<String,List<Emp>> m3 = ls.stream().collect(Collectors.groupingBy(e->e.designation));
        System.out.println(m3);

        Map<String,Long> m4 = ls.stream().collect(Collectors.groupingBy(e->e.designation,Collectors.counting()));
        System.out.println(m4);

        Map<String,List<String>> m5 = ls.stream().collect(Collectors.groupingBy(e->e.designation,Collectors.mapping(e->e.name.toUpperCase(),Collectors.toList())));
        System.out.println(m5);

        Map<String,Double> m6 = ls.stream().collect(Collectors.groupingBy(e->e.designation,Collectors.summingDouble(e->e.salary)));
        System.out.println(m6);
    }
}


// Thread


//..1
class A implements Runnable {

    @Override
    public void run() {
        synchronized (A.class){
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Demo_Thread{
    public static void main(String[] args){
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();

        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(a2);
        Thread t3 = new Thread(a3);

        t1.setName("Geeta");
        t2.setName("Neeta");
        t3.setName("Sita");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Main thread end");
    }
}


//..2

class Demo_Concurrency{
    public static void main(String[] args){
        Semaphore sem = new Semaphore(2);

        new IncThread("Ram",sem);
        new DecThread("Shyam",sem);
        new IncThread("Om",sem);
        new DecThread("Onkar",sem);
        new IncThread("Ravan",sem);
        new DecThread("Yash",sem);
        new IncThread("Sandeep",sem);
        new DecThread("Nikhil",sem);

    }
}

class Shared{
    static int cnt=0;
}

class IncThread implements Runnable{

    String name;
    Semaphore sem;

    IncThread(String n,Semaphore sem){
        name = n;
        this.sem = sem;
        new Thread(this).start();
    }


    @Override
    public void run() {
        System.out.println(name+ " is waiting for permission");
        try {
            sem.acquire();
            System.out.println(name+" got permission");
            for(int i=1;i<=5;i++){
                Shared.cnt++;
                System.out.println(name+" : "+Shared.cnt);
                Thread.sleep(1000);
            }
            System.out.println(name+" released permission");
            sem.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class DecThread implements Runnable{

    String name;
    Semaphore sem;

    DecThread(String n,Semaphore sem){
        name = n;
        this.sem = sem;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println(name+ " is waiting for permission");
        try {
            sem.acquire();
            System.out.println(name+" got permission");
            for(int i=1;i<=5;i++){
                Shared.cnt--;
                System.out.println(name+" : "+Shared.cnt);
                Thread.sleep(1000);
            }
            System.out.println(name+" released permission");
            sem.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


//..3

class Demo_Con2{
    public static void main(String[] args){
        Exchanger<String> ex = new Exchanger<>();

        new Sender(ex);
        new Receiver(ex);
    }
}

class Sender implements Runnable{
    Exchanger<String> ex;

    Sender(Exchanger<String> e){
        ex=e;
        new Thread(this).start();
    }

    public void run(){
        String names[] = {"Yash","Jayant","Mohit","Nilesh","Shreyas"};

        for (int i=0;i<names.length;i++){
            String str = null;
            try {
                str = ex.exchange(names[i]);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Received by Sender : "+str);
        }
    }
}

class Receiver implements Runnable{
    Exchanger<String> ex;

    Receiver(Exchanger<String> e){
        ex=e;
        new Thread(this).start();
    }

    public void run(){
        String names[] = {"Rajesh","Suresh","Mahesh","Dinesh","Ganesh"};

        for (int i=0;i<names.length;i++){
            String str = null;
            try {
                str = ex.exchange(names[i]);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Received by Receiver : "+str);
        }
    }
}

//..4

class Demo_CyclicBarrier{
    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cb = new CyclicBarrier(5,new SomeAction());
        Print.Print("Starting.......");

        for (int i=1;i<=20;i++){
            new MyThread(cb,"Thread "+i);
            Thread.sleep(2000);
        }
    }
}

class MyThread implements Runnable{
    String name;
    CyclicBarrier cb;
    MyThread(CyclicBarrier cb,String name){
        this.name = name;
        this.cb = cb;
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            Print.Print(name+" waiting to start");
            cb.await();
            Print.Print(name+" : Just for Demo***");
        } catch (Exception e) {
            Print.Print(e);
        }
    }
}

class SomeAction implements Runnable{
    @Override
    public void run() {
        Print.Print("Finished......");
    }
}


//..4

class Demo_Con4{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println("no. : "+processors);

        ExecutorService ex = Executors.newFixedThreadPool(processors);

        Future<Integer> f1 = ex.submit(new Sum(5));
        ex.submit(new Axx());
        ex.submit(new B());

        Future<Integer> f2 = ex.submit(new Sum(15));
        Future<Integer> f3 = ex.submit(new Sum(500));
        Future<Double> f4 = ex.submit(new Cube(3.3));
        Future<Double> f5 = ex.submit(new Cube(10.5));

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());
        System.out.println(f5.get());

        ex.shutdown();
    }
}

class Axx implements Runnable{
    public void run(){
        System.out.println("From A class using Runnable interface");
    }
}

class B extends Thread{
    public void run(){
        System.out.println("From B class using thread class");
    }
}

class Sum implements Callable<Integer>{
    int val;
    Sum(int val){
        this.val = val;
    }

    public Integer call(){
        int res = 0;
        for (int i=0;i<=val;i++){
            res +=i;
        }
        return res;
    }
}

class Cube implements Callable<Double>{
    double val;
    Cube(double val){
        this.val = val;
    }

    public Double call(){
        return val*val*val;
    }
}


//..5

class Demo_Con5{
    public static void main(String[] args){
        ReentrantLock rl = new ReentrantLock();

        new MyThreadx("Ravi",rl);
        new MyThreadx("Manoj",rl);
        new MyThreadx("Hameed",rl);
        new MyThreadx("John",rl);
        new MyThreadx("Gurpreet",rl);

    }
}

class MyThreadx implements Runnable{
    String name;
    ReentrantLock rl;

    MyThreadx(String name,ReentrantLock rl){
        this.name = name;
        this.rl = rl;
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name+ " is waiting for permission");
            rl.lock();
            System.out.println(name+" got permission");
            rl.lock();
            for(int i=1;i<=10;i++){
                System.out.println(name+" "+i);
                Thread.sleep(1000);
            }
            rl.unlock();
            System.out.println(name+" released lock/permission");
            rl.unlock();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


//..6

class Demo_Con6{
    public static void main(String[] args){

        CountDownLatch cd = new CountDownLatch(7);

        System.out.println("Starting.......");

        new MyThread6(cd);

        try{
            cd.await();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Finished.......");
    }
}

class MyThread6 implements Runnable{

    CountDownLatch cd;

    MyThread6(CountDownLatch cd){
        this.cd = cd;
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            for(int i=1;i<=10;i++){
                System.out.println(i);
                cd.countDown();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

//..7

class Demo_Con7{
    public  static void main(String[] args){
        new MyThread7("Y");
        new MyThread7("A");
        new MyThread7("S");
        new MyThread7("H");
    }
}

class Sharedx{
    static AtomicInteger cnt = new AtomicInteger(0);
}

class MyThread7 implements Runnable{
    String name;
    MyThread7(String name){
        this.name = name;
        new Thread(this).start();
    }

    public void run(){
        System.out.println(name+" : "+Sharedx.cnt.getAndIncrement());
    }
}


//..8

class Demo_Con8{
    public static void main(String[] args) throws InterruptedException {

        Thread.currentThread().join();
        Phaser phsr = new Phaser(1);

        new MyThread8(phsr,"A");
        new MyThread8(phsr,"B");
        new MyThread8(phsr,"C");
        new MyThread8(phsr,"D");
        new MyThread8(phsr,"E");

        int curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Phase "+curPhase+" completed");

        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Phase "+curPhase+" completed");

        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Phase "+curPhase+" completed");

        phsr.arriveAndDeregister();
        if(phsr.isTerminated())
            System.out.println("Phaser terminated!!");
    }
}

class MyThread8 implements Runnable{
    Phaser phsr;
    String name;
    MyThread8(Phaser phsr,String name){
        this.phsr = phsr;
        this.name = name;
        phsr.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        try{
            System.out.println("Thread "+name+" beginning phase zero");
            phsr.arriveAndAwaitAdvance();
            
            Thread.sleep(2000);

            System.out.println("Thread "+name+" beginning phase one");
            phsr.arriveAndAwaitAdvance();

            Thread.sleep(2000);

            System.out.println("Thread "+name+" beginning phase two");
            phsr.arriveAndDeregister();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

