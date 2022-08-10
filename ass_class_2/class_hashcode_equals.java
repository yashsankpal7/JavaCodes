package ass_class_2;

import classWork.HashCode_;

import java.util.HashSet;
import java.util.Set;

public class class_hashcode_equals {
    static class Students{
        int id;
        String name;
        String dept;
        String designation;

        Students(int id,String name,String dept,String designation){
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
            Students ob = (Students) obj;
            System.out.println(this.id);
            return this.name.equals(ob.name);
        }
    }
    public static void main(String[] args){
        System.out.println("Written By Yash");
        Set<Students> lis = new HashSet<Students>();
        lis.add(new Students(1,"temp","CC","deccd"));
        lis.add(new Students(2,"temp1","CCa","decd"));
        lis.add(new Students(3,"temp11","CCb","ccd"));
        lis.add(new Students(4,"temp111","CCc","eccd"));
        lis.add(new Students(5,"temp1111","CCd","decd"));

        for(Students nm:lis){
            System.out.println(nm);
        }
    }
}
