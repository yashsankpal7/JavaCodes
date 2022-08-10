package classWork;

import java.util.ArrayList;

public class ArrayListEmployee {
    static class Employee{
        int id;
        String name;
        String dept;
        String designation;

        Employee(int id,String name,String dept,String designation){
            this.id = id;
            this.name = name;
            this.dept = dept;
            this.designation = designation;
        }

        public String toString(){
            return " ID: "+this.id+" Name: "+this.dept+" Dept: "+this.dept+" Designation: "+this.designation;
        }
    }
    public static void main(String[] args){
        System.out.println("Written By Yash");
        ArrayList<Employee> lis = new ArrayList<Employee>();
        lis.add(new Employee(1,"temp","CC","deccd"));
        lis.add(new Employee(2,"temp1","CCa","decd"));
        lis.add(new Employee(3,"temp11","CCb","ccd"));
        lis.add(new Employee(4,"temp111","CCc","eccd"));
        lis.add(new Employee(5,"temp1111","CCd","decd"));

        for(Employee nm:lis){
            System.out.println(nm);
        }
    }
}
