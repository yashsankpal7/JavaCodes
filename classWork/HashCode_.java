package classWork;

import java.util.HashSet;
import java.util.Set;

public class HashCode_ {
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

        public int hashCode(){
            return id+name.hashCode();
        }

        public boolean equals(Object obj){
            Employee ob = (Employee) obj;
            System.out.println(this.id);
            return this.name.equals(ob.name);
        }
    }
    public static void main(String[] args){
        System.out.println("Written By Yash");
        Set<Employee> lis = new HashSet<Employee>();
        lis.add(new Employee(1,"temp","CC","deccd"));
        lis.add(new Employee(2,"temp1","CCa","decd"));
        lis.add(new Employee(3,"temp11","CCb","ccd"));
        lis.add(new Employee(4,"temp111","CCc","eccd"));
        lis.add(new Employee(5,"temp1111","CCd","decd"));

        for(Employee nm:lis){
            System.out.println(nm.equals(new Employee(5,"temp1111","CCd","decd")));
        }
    }
}
