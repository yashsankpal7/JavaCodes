package classWork;

import java.util.Scanner;

class Employee{
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
public class DataHiding {
    public static void main(String[] args){
        System.out.println("Written By Yash");
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
}
