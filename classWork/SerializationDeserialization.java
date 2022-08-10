package classWork;

import java.io.*;

public class SerializationDeserialization {
    static class Employee implements Serializable {
        int id;
        String name;
        transient String dept;
        String designation;

        Employee(int id,String name,String dept,String designation){
            this.id = id;
            this.name = name;
            this.dept = dept;
            this.designation = designation;
        }

        public String toString(){
            return " ID: "+this.id+" Name: "+this.name+" Dept: "+this.dept+" Designation: "+this.designation;
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee emp = new Employee(1,"temp","CC","deccd");

        //Serialization
        FileOutputStream fo = new FileOutputStream("C:\\Users\\yash sankpal\\Desktop\\DataOut.txt");
        ObjectOutputStream os = new ObjectOutputStream(fo);

        os.writeObject(emp);
        System.out.println("Serialized Successfully");
        fo.close();
        os.close();

        //Deserialization
        FileInputStream fs = new FileInputStream("C:\\Users\\yash sankpal\\Desktop\\DataOut.txt");
        ObjectInputStream is = new ObjectInputStream(fs);

        Employee emp_ = (Employee) is.readObject();
        System.out.println(emp_);

        fs.close();
        is.close();
    }
}
