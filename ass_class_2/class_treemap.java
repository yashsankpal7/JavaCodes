package ass_class_2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class class_treemap {
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
        Map<Integer, Employee> lis = new TreeMap<Integer, Employee>();

        lis.put(3,new Employee(1,"temp","CC","deccd"));
        lis.put(2,new Employee(2,"temp1","CCa","decd"));
        lis.put(1,new Employee(3,"temp11","CCb","ccd"));
        lis.put(4,new Employee(4,"temp111","CCc","eccd"));
        lis.put(5,new Employee(5,"temp1111","CCd","decd"));

        Set<Map.Entry<Integer, Employee>> obj1 = lis.entrySet();
        for(Map.Entry<Integer, Employee> Obj:obj1) {
            System.out.println("Key: "+Obj.getKey());
            System.out.println("Value: "+Obj.getValue());
        }
    }
}
