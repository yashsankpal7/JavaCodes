package assignment;

import java.util.Scanner;

public class abstract2 {
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

    static class RegularEmployee extends EmployeeAbstract{

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

            sc.close();
        }

    }

    static class ContractEmployee extends EmployeeAbstract{

        float payPerHour;
        float noOfHoursWorked;

        public ContractEmployee(int id, String name, String dept, String desi) {
            super(id, name, dept, desi);
        }

        void calculateSalary() {
            getDetailsForSalary();
            salary=noOfHoursWorked/12 * payPerHour;
        }

        void getDetailsForSalary() {
            Scanner sc = new Scanner(System.in);

            System.out.println("Salary per Hour?");
            payPerHour=sc.nextInt();

            System.out.println("Employee hours ?");
            noOfHoursWorked=sc.nextInt();

            sc.close();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Written By Yash");
        System.out.println("Enter type: ");
        String input = sc.next();

        EmployeeAbstract empObjT=null;
        if(input.equalsIgnoreCase("Regular")) {
            empObjT = new RegularEmployee(1210,"Shankar","Tech","Technical Lead");

            empObjT.calculateSalary();

            System.out.println(empObjT);
        }
        else if(input.equalsIgnoreCase("Contract")){
            empObjT = new ContractEmployee(1211,"Vijay","Tech","Technical Developer");

            empObjT.calculateSalary();

            System.out.println(empObjT);
        }else{
            System.out.println("System terminating!");
        }
    }
}
