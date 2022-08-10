package ass_class_2;

import java.util.Scanner;

public class _32 {

    //DataHiding
    static class Employee{
        private int id;
        private String name;
        private String dept;
        private String designation;
        private int salary=20000;

        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getDept() {
            return dept;
        }
        public void setDept(String dept) {
            this.dept = dept;
        }
        public String getDesignation() {
            return designation;
        }
        public void setDesignation(String designation) {
            this.designation = designation;
        }
        public int getSalary() {
            return salary;
        }
        public void setSalary(int salary) {
            this.salary = salary;
        }

    }

    static void dataHiding(){
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.println("Enter ID");
        emp.setId(sc.nextInt());

        System.out.println("Enter Name");
        emp.setName(sc.next());

        System.out.println("Enter Dept");
        emp.setDept(sc.next());

        System.out.println("Enter Designation");
        emp.setDesignation(sc.next());

        System.out.println("ID "+emp.getId()+"Name "+emp.getName()+"Dept "+emp.getDept()+"Designation "+emp.getDesignation());
    }

    //Polymorphism

        //Overriding
        static class Ethereum {

            void layer()
            {
                System.out.println("Layer 1");
            }
        }

        static class Polygon extends Ethereum {

            void layer()
            {
                System.out.println("Layer 2");
            }
        }

        //Overloading
        static class Palindrome{
            boolean checkPalindrome(int num){
            int rev_num = 0,temp_num=num;
            while (num > 0) {
                rev_num = rev_num * 10 + num % 10;
                num = num / 10;
            }
            return rev_num == temp_num;
        }

            boolean checkPalindrome(String str){
            int i = 0, j = str.length() - 1;
            while (i < j) {

                if (str.charAt(i) != str.charAt(j))
                    return false;
                i++;
                j--;
            }
            return true;
        }

        }

    static void polyMorphism(){

        //Overriding
        Polygon d1 = new Polygon();
        Ethereum a1 = new Ethereum();

        d1.layer();
        a1.layer();

        //Overloading
        Palindrome p = new Palindrome();
        System.out.println("Palindrome :"+(p.checkPalindrome(1001)?"Yes":"No"));
        System.out.println("Palindrome :"+(p.checkPalindrome("MOM")?"Yes":"No"));
    }

    //Inheritance
    static class Doctor {
        void Doctor_Details() {
            System.out.println("Doctor Details...");
        }
    }

    static class Surgeon extends Doctor {
        void Surgeon_Details() {
            System.out.println("Surgen Detail...");
        }
    }

    static void inheritance(){
        Surgeon s = new Surgeon();
        s.Doctor_Details();
        s.Surgeon_Details();
    }

    //Abstraction
    static abstract class ICar_{
        abstract void display();

    }

    static class BMW extends ICar_ {

        @Override
        public void display() {
            // TODO Auto-generated method stub
            System.out.println("BMW");
        }

    }

    static class Ferrari extends ICar_ {

        @Override
        public void display() {
            // TODO Auto-generated method stub
            System.out.println("Ferrari");
        }

    }

    static void abstraction(){
        BMW bmw = new BMW();
        Ferrari ferrari = new Ferrari();

        bmw.display();
        ferrari.display();
    }
    public static void main(String[] args){
        dataHiding();
        polyMorphism();
        inheritance();
        abstraction();
    }
}
