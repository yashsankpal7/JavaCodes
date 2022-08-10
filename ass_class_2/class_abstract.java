package ass_class_2;

import java.util.Scanner;

public class class_abstract {
    static abstract class EmployeeAbstract{
        int id;
        String name;
        float salary;

        public EmployeeAbstract(int id,String name) {
            this.id = id;
            this.name = name;
        }

        abstract void calculateSalary();

        public String toString() {
            return "Id:"+this.id+" | Name: "+this.name+" | Salary: "+this.salary;
        }
    }

    static class RegularEmployee extends EmployeeAbstract {

        float salaryPerMonth;
        float noOfDaysWorked;

        public RegularEmployee(int id, String name) {
            super(id, name);
        }

        void calculateSalary() {
            getDetailsForSalary();
            salary=noOfDaysWorked/30*salaryPerMonth;
        }

        void getDetailsForSalary() {
            Scanner sc = new Scanner(System.in);

            System.out.println("Salary per Month?");
            salaryPerMonth=sc.nextInt();

            System.out.println("Employee days ?");
            noOfDaysWorked=sc.nextInt();

        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        EmployeeAbstract empObj = new RegularEmployee(1210,"Shankar");

        empObj.calculateSalary();

        System.out.println(empObj);

    }
}
