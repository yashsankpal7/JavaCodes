package classWork;

public class Generics_ {
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

    static class Generics<T>{
        T data;
        void assign(T data){
            this.data = data;
        }

        void display(){
            System.out.println("Data is : "+data);
        }
    }
    public static void main(String[] args){
        System.out.println("Written By Yash");

        Generics<Integer> o1 = new Generics<>();
        o1.assign(10);
        o1.display();

        Generics<String> o2 = new Generics<>();
        o2.assign("Hello");
        o2.display();

        Generics<Employee> o3 = new Generics<>();
        Employee emp = new Employee(1,"temp","CC","deccd");
        o3.assign(emp);
        o3.display();
    }
}
