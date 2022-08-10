package classWork;

import java.util.Scanner;

public class Constructor {
    private int id;
    private String name;
    private String div;

    Constructor(){
        id=0;
        name="Zahard";
        div="D";
    }

    Constructor(int id,String name,String div){
        this.id=id;
        this.name=name;
        this.div=div;
    }

    public String toString() {
        return this.id+" "+this.name+" "+this.div;
    }
    public static void main(String[] args) {
        System.out.println("Written By Yash");
        Scanner sc = new Scanner(System.in);

        Constructor stu1 = new Constructor();
        Constructor stu2 = new Constructor(sc.nextInt(),sc.next(),sc.next());

        System.out.println(stu1);
        System.out.println(stu2);
    }
}

