package ass_class_2;

import java.util.Scanner;

public class _28 {
    private int id;
    private String name;
    private String dept;
    private String designation;

    _28(){
        this.id=12121;
        this.name="Siu";
        this.dept="Elex";
        this.designation = "CR";
    }

    _28(int id,String name,String dept,String designation){
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

        _28 stu1 = new _28();
//        class_constructor stu2 = new class_constructor(sc.nextInt(),sc.next(),sc.next(),sc.next());
        _28 stu2 = new _28(123,"yash","IT","student");
        System.out.println(stu1);
        System.out.println(stu2);
    }
}

