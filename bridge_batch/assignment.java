import java.util.*;
import java.util.concurrent.CyclicBarrier;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Assignment 1
class Employee{

    String name,designation,gender,department;
    int age;
    double salary;
    Employee(String name,String designation,String gender,String department,int age,double salary){
      this.name = name;
      this.designation = designation;
      this.gender = gender;
      this.age = age;
      this.salary = salary;
      this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
/*

List all employees below age 30;
List all employees above age 30 and designation Tester;
List all employees whose salary is above 50000 and gender is Male;
List all female employees
Give bonus salary of Rs 100000 to all employees

*/
class Output{

    public static void Out(Predicate<Employee> pd, List<Employee> ls){
        ls.forEach(x->{
            if(pd.test(x)) System.out.println(x);
        });
    }

    public static void Add(Employee ls){
        ls.salary += 100000.0;
    }

    public static void main(String[] args){
        List<Employee> ls = new ArrayList<Employee>();

        ls.add(new Employee("Yash","Programmer","Male","SDE",25,900000));
        ls.add(new Employee("Abdul","Tester","Male","STE",21,700000));
        ls.add(new Employee("Yogesh","Programmer","Male","SDE",33,600000));
        ls.add(new Employee("Advait","Manager","Male","Management",31,600000));
        ls.add(new Employee("Yogini","Tester","Female","STE",29,500000));
        ls.add(new Employee("Roshni","Tester","Female","STE",22,600000));


//      List all employees below age 30;
        Predicate<Employee> pd = (employee)-> employee.age > 30;
        Out(pd,ls);
        System.out.println("--");
//      List all employees above age 30 and designation Tester;
        Predicate<Employee> pd_ = (employee)-> employee.age > 30 && employee.designation.equalsIgnoreCase("Tester");
        Out(pd_,ls);
        System.out.println("--");
//      List all employees whose salary is above 50000 and gender is Male;
        Predicate<Employee> pd__ = (employee)-> employee.salary > 50000 && employee.gender.equalsIgnoreCase("Male");
        Out(pd__,ls);
        System.out.println("--");
//      List all female employees
        Predicate<Employee> pd___ = (employee)-> employee.gender.equalsIgnoreCase("Female");
        Out(pd___,ls);
        System.out.println("--");
//      Give bonus salary of Rs 100000 to all employees
        ls.forEach(Output::Add);
        ls.forEach(System.out::println);
    }
}


// Assignment 2

/*
Total expense department wise
5 Senior most employees of the company
How many male & female employees
What type of company is it
    Young <30
    Midage 30-40
    Senior >40
 */

class Output_2{
    public static void main(String[] args){
        List<Employee> ls = new ArrayList<Employee>();

        ls.add(new Employee("Yash","Programmer","Male","SDE",35,500000));
        ls.add(new Employee("Abdul","Tester","Male","STE",31,600000));
        ls.add(new Employee("Yogesh","Programmer","Male","SDE",33,400000));
        ls.add(new Employee("Advait","Manager","Male","Management",31,500000));
        ls.add(new Employee("Yogini","Tester","Female","STE",39,400000));
        ls.add(new Employee("Roshni","Tester","Female","STE",32,600000));

        ls.add(new Employee("Sylvia","Manager","Male","Management",23,500000));
        ls.add(new Employee("Zahard","Tester","Male","STE",35,600000));
        ls.add(new Employee("Kartik","Programmer","Male","SDE",34,400000));
        ls.add(new Employee("Adarsh","Manager","Male","Management",34,500000));
        ls.add(new Employee("Sneha","Tester","Female","STE",39,400000));
        ls.add(new Employee("Akansha","Manager","Female","Management",25,600000));


//        Total expense department wise
        Map<String,Double> ass1 = ls.stream().collect(Collectors.groupingBy(e->e.department,Collectors.summingDouble(e->e.salary)));
        System.out.println(ass1);

//        5 Senior most employees of the company
        List<Employee> ass2 = ls.stream().sorted((emp1, emp2)-> Integer.compare(emp2.age, emp1.age)).limit(5).collect(Collectors.toList());
        System.out.println(ass2);

//        How many male & female employees
        Map<String,Long> ass3 = ls.stream().collect(Collectors.groupingBy(e->e.gender,Collectors.counting()));
        System.out.println(ass3);

//        What type of company is it
//          Young <30
//          Midage 30-40
//          Senior >40

        ls.stream().collect(Collectors.groupingBy(e->{
            if( e.age > 0 && e.age < 30){
                return "Young";
            } else if (e.age >= 30 && e.age <= 40) {
                return "Midage";
            }else{
                return "Senior";
            }
        },Collectors.counting())).entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).limit(1).forEach(System.out::println);

    }


}


// Assignment 3

class Cyclic_Barrier{
    static PriorityQueue<Place> pq;
    public static void main(String[] args) throws InterruptedException {

        int n=10;

        // cyclic barrier
        CyclicBarrier cb = new CyclicBarrier(n,new Action());
        System.out.println("Reach starting point!!....");

        Cyclic_Barrier.pq = new PriorityQueue<>(new Comp());

        // create n threads
        for (int i=1;i<=n;i++){
            new Vehicle("Vehicle "+i,cb);
            Thread.sleep(1000);
        }
    }
}

class Place{
    String name;
    long diff,end;

    Place(String name,long diff,long end){
        this.name = name;
        this.diff = diff;
        this.end = end;
    }


    @Override
    public String toString() {
        return "Place{" +
                "name='" + name + '\'' +
                ", diff=" + diff +
                ", end=" + end +
                '}';
    }
}
class Comp implements Comparator<Place>{

    @Override
    public int compare(Place o1, Place o2) {
        return Long.compare(o1.diff,o2.diff);
    }
}

class Vehicle implements Runnable{

    String name;
    long diff;
    Date start,end;
    CyclicBarrier cb;
    Random rnd;

    Vehicle(String name,CyclicBarrier cb){
        this.name = name;
        this.cb = cb;
        new Thread(this).start();
    }


    @Override
    public void run() {
        try{
            System.out.println(name+" ready!!");

            cb.await();
            start = new Date();
            System.out.println(name+" : "+start.getTime());

            Thread.sleep((int) (Math.random() * (3000 - 1000 + 1)) +1000 ); // wait for 10secs

            end = new Date();

            diff = end.getTime() - start.getTime();

            System.out.println(name+" "+diff+" "+end.getTime());
            Cyclic_Barrier.pq.add(new Place(name,diff,end.getTime()));

            cb.await();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}


class Action implements Runnable{

    @Override
    public void run() {
        if(Cyclic_Barrier.pq.isEmpty()) System.out.println("Run....");
        else {
            Cyclic_Barrier.pq.forEach(System.out::println);
        }
    }
}
