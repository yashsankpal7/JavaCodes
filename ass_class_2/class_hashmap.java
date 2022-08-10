package ass_class_2;



import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class class_hashmap {
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

        public String toString() {
            return " ID: " + this.id + " Name: " + this.dept + " Dept: " + this.dept + " Designation: " + this.designation;
        }
    }
    public static void main(String[] args){
        System.out.println("Written By Yash");

        Map<Integer, Employee> map = new HashMap<Integer, Employee>();

        map.put(map.size(),new Employee(1,"temp","CC","deccd"));
        map.put(map.size(),new Employee(2,"temp1","CCa","decd"));
        map.put(map.size(),new Employee(3,"temp11","CCb","ccd"));
        map.put(map.size(),new Employee(4,"temp111","CCc","eccd"));
        map.put(map.size(),new Employee(5,"temp1111","CCd","decd"));

        map.forEach((k,v) -> System.out.println(v.name));
    }
}
