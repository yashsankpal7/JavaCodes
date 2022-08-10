package ass_class_2;

import java.util.Scanner;

public class _29 {
    static abstract class StudentAbstract{
        int id;
        String name;
        String dept;
        float attendance;
        public StudentAbstract(int id,String name,String dept) {
            this.id = id;
            this.name = name;
            this.dept = dept;
        }

        abstract void calculateAttendance();
        public String toString() {
            return "Id:"+this.id+" | Name: "+this.name+" | Dept: "+this.dept+" | Attendance: "+this.attendance+"%";
        }
    }
    static class RegularStudent extends StudentAbstract {

        int noOfclasses = 100;
        int attended;

        public RegularStudent(int id, String name, String dept) {
            super(id, name, dept);
        }

        void calculateAttendance(){
            Scanner sc = new Scanner(System.in);
            attended = sc.nextInt();
            attendance = attended/noOfclasses*100;
            sc.close();
        }

    }
    static class CorrespondenceStudent extends StudentAbstract {

        int noOfDays= 40;
        int attended;
        public CorrespondenceStudent(int id, String name, String dept) {
            super(id, name, dept);
        }

        void calculateAttendance(){
            Scanner sc = new Scanner(System.in);
            attended = sc.nextInt();
            attendance = attended/noOfDays*100;
            sc.close();
        }

    }

    public static void main(String[] args){
        System.out.println("Written By Yash");
        Scanner sc=new Scanner(System.in);

        System.out.println("Written By Yash");

        StudentAbstract empObj = new RegularStudent(1210,"Shankar","Tech");

        empObj.calculateAttendance();
        System.out.println(empObj);

        StudentAbstract empObj2 = new CorrespondenceStudent(1211,"Shann","Elex");

        empObj2.calculateAttendance();
        System.out.println(empObj2);
    }
}
