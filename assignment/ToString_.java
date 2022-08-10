package assignment;

import java.util.Scanner;

public class ToString_ {
    private int id;
    private String name;
    private String div;

    ToString_(){
        id=0;
        name="Zahard";
        div="D";
    }

    ToString_(int id,String name,String div){
        this.id=id;
        this.name=name;
        this.div=div;
    }

    public String toString() {
        return this.id+" "+this.name+" "+this.div;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ToString_ stu1 = new ToString_();
        ToString_ stu2 = new ToString_(sc.nextInt(),sc.next(),sc.next());

        System.out.println(stu1.toString());
        System.out.println(stu2.toString());
    }
}
