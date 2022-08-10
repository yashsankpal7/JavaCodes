package ass_class_2;
import java.util.Scanner;

public class class_constructor {
    private int id;
    private String name;
    private String dept;
    private String designation;

    class_constructor(){
        System.out.println("In the default construtor...");
    }

    class_constructor(int id,String name,String dept,String designation){
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.designation = designation;
    }

    public String toString() {
        return this.id+" "+this.name+" "+this.dept+" "+this.designation;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        class_constructor stu1 = new class_constructor();
//        class_constructor stu2 = new class_constructor(sc.nextInt(),sc.next(),sc.next(),sc.next());
        class_constructor stu2 = new class_constructor(123,"yash","IT","analyst");
        System.out.println(stu1);
        System.out.println(stu2);
    }
}
