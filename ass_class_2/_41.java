package ass_class_2;

import java.util.ArrayList;
import java.util.Scanner;

public class _41 {
    static class Student {
        String name;
        int roll_no;

        Student(String name,int roll_no){
            this.name = name;
            this.roll_no = roll_no;
        }

        @Override
        public String toString() {
            return "Student| " + "name= " + name + ", roll_no= " + roll_no;
        }
    }

    public static Student findById(ArrayList<Student> lis,int id){
        return lis.stream().filter(student -> student.roll_no == id).findFirst().orElse(null);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> lis = new ArrayList<Student>();
        int ch;
        boolean cont = true;

        String name;
        int roll_no;
        Student tmp;
        while(cont) {
            System.out.println("choice 1 Insert \nchoice 2 display \nchoice 3 display by choice \nchoice 4 Update \n choice 5 delete \nchoice 6 terminate\nchoose any one: ");
            ch=sc.nextInt();

            switch(ch) {
                case 1:
                    System.out.println("Enter Student name and roll no.: ");
                    name = sc.next();
                    roll_no = sc.nextInt();
                    lis.add(new Student(name,roll_no));
                    break;
                case 2:
                    for(Student stu:lis){
                        System.out.println(stu);
                    }
                    break;
                case 3:
                    System.out.println("Enter student roll no.: ");
                    roll_no = sc.nextInt();
                    tmp = findById(lis,roll_no);
                    if(tmp == null) System.out.println("Not there!!");
                    else{
                        System.out.println(tmp);
                    }
                    break;
                case 4:
                    System.out.println("Enter student roll no.: ");
                    roll_no = sc.nextInt();
                    tmp = findById(lis,roll_no);
                    if(tmp == null) System.out.println("Not there!!");
                    else{
                        System.out.println("Enter Student name: ");
                        name = sc.next();
                        tmp.name = name;
                    }
                    break;
                case 5:
                    System.out.println("Enter student roll no.: ");
                    roll_no = sc.nextInt();
                    int finalRoll_no = roll_no;
                    lis.removeIf(student -> student.roll_no == finalRoll_no);
                    break;
                case 6:
                    cont=false;
                    break;
                default:
                    System.out.println("Select between 1 to 4....");
            }

            System.out.println("Thanks");
        }
    }
}
