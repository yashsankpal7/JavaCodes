package classWork;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_ {
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

    static class sortName implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {

            Employee obj1 = (Employee) o1;
            Employee obj2 = (Employee) o2;
            return obj1.name.compareTo(obj2.name);
        }
    }

    static class sortDept implements  Comparator{

        @Override
        public int compare(Object o1, Object o2) {

            Employee obj1 = (Employee) o1;
            Employee obj2 = (Employee) o2;
            return obj1.dept.compareTo(obj2.dept);
        }
    }

    static class sortDesignation implements  Comparator{

        @Override
        public int compare(Object o1, Object o2) {

            Employee obj1 = (Employee) o1;
            Employee obj2 = (Employee) o2;
            return obj1.designation.compareTo(obj2.designation);
        }
    }

    static class sortId implements Comparator{

        @Override
        public int compare(Object o1, Object o2) {

            Employee obj1 = (Employee) o1;
            Employee obj2 = (Employee) o2;

            return (obj1.id < obj2.id)?-1:(obj1.id == obj2.id)?0:1;
        }
    }

    public static void main(String[] args){
        System.out.println("Written By Yash");
        List<Employee> lis = new ArrayList<Employee>();

        lis.add(new Employee(1,"temp","CC","deccd"));
        lis.add(new Employee(2,"temp1","CCa","decd"));
        lis.add(new Employee(3,"temp1","CCb","ccd"));
        lis.add(new Employee(4,"temp111","CCc","eccd"));
        lis.add(new Employee(5,"temp111","CCd","decd"));

        for(Employee mvObj: lis){
            System.out.println(mvObj.id+" "+mvObj.name+" "+mvObj.dept+" "+mvObj.designation);
        }
        System.out.println();

        Collections.sort(lis,new sortId());
        for(Employee mvObj: lis){
            System.out.println(mvObj.id+" "+mvObj.name+" "+mvObj.dept+" "+mvObj.designation);
        }
        System.out.println();

        Collections.sort(lis,new sortName());
        for(Employee mvObj: lis){
            System.out.println(mvObj.id+" "+mvObj.name+" "+mvObj.dept+" "+mvObj.designation);
        }
        System.out.println();

        Collections.sort(lis,new sortDept());
        for(Employee mvObj: lis){
            System.out.println(mvObj.id+" "+mvObj.name+" "+mvObj.dept+" "+mvObj.designation);
        }
        System.out.println();

        Collections.sort(lis,new sortDesignation());
        for(Employee mvObj: lis){
            System.out.println(mvObj.id+" "+mvObj.name+" "+mvObj.dept+" "+mvObj.designation);
        }
        System.out.println();
    }
}
