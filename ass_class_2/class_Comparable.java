package ass_class_2;


import classWork.Comparable_;
import classWork.Comparator_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class class_Comparable {
    static class Employee implements Comparable {
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

        @Override
        public int compareTo(Object o) {
            Employee obj = (Employee) o;
            return this.name.compareTo(obj.name);
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

        Collections.sort(lis);

        for(Employee mvObj: lis){
            System.out.println(mvObj.id+" "+mvObj.name+" "+mvObj.dept+" "+mvObj.designation);
        }
        System.out.println();
    }
}
