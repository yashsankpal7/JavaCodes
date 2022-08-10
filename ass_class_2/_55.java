package ass_class_2;

import assignment.Serialization;

import java.io.*;

public class _55 {
    static class Book implements Serializable {
        int id;
        double price;
        String title;
        transient String publisher;

        Book (int id,String title,double price,String publisher){
            this.id = id;
            this.title = title;
            this.price = price;
            this.publisher = publisher;
        }

        public String toString(){
            return " ID: "+this.id+" title: "+this.title+" price: "+this.price+" Designation: "+this.publisher;
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        try{
            Book emp = new Book (12123,"Ready Player one",29.9,"ernest clint");

            //Serialization
            FileOutputStream fo = new FileOutputStream("C:\\Users\\yash sankpal\\Desktop\\Wissen_\\DataOut.txt");
            ObjectOutputStream os = new ObjectOutputStream(fo);

            os.writeObject(emp);
            System.out.println("Serialized Successfully");
            fo.close();
            os.close();

            //Deserialization
            FileInputStream fs = new FileInputStream("C:\\Users\\yash sankpal\\Desktop\\Wissen_\\DataOut.txt");
            ObjectInputStream is = new ObjectInputStream(fs);

            Book emp_ = (Book) is.readObject();
            System.out.println(emp_);
            fs.close();
            is.close();
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Job done :V");
        }

    }
}
