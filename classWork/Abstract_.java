package classWork;

import java.util.Scanner;

public class Abstract_ {
    static abstract class EmployeeAbstract{
        int id;
        String name;
        String dept;
        String desi;
        float salary;

        public EmployeeAbstract(int id,String name,String dept,String desi) {
            this.id = id;
            this.name = name;
            this.dept = dept;
            this.desi = desi;
        }

        abstract void calculateSalary();

        public String toString() {
            return "Id:"+this.id+" | Name: "+this.name+" | Dept: "+this.dept+" | Designation: "+this.desi+" | Salary: "+this.salary;
        }
    }
    static class RegularEmployee extends EmployeeAbstract {

        float salaryPerMonth;
        float noOfDaysWorked;

        public RegularEmployee(int id, String name, String dept, String desi) {
            super(id, name, dept, desi);
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
    public static void main(String[] args){
        System.out.println("Written By Yash");
        Scanner sc=new Scanner(System.in);

        System.out.println("Written By Yash");

        EmployeeAbstract empObj = new RegularEmployee(1210,"Shankar","Tech","Technical Lead");

        empObj.calculateSalary();

        System.out.println(empObj);
    }
}
