package ass_class_2;

import assignment.Serialization;

import java.io.*;

public class class_serialization {
    static class Movie implements Serializable {
        int id;
        double imdb;
        String name;
        transient String code;

        Movie(int id,String name,double imdb,String code){
            this.id = id;
            this.name = name;
            this.imdb = imdb;
            this.code = code;
        }

        public String toString(){
            return " ID: "+this.id+" Name: "+this.name+" Imdb: "+this.imdb+" Designation: "+this.code;
        }
    }
    public static void main(String[] args)  {

        try{
            Movie emp = new Movie(1,"temp",6.6,"#adad2j9");

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

            Movie emp_ = (Movie) is.readObject();
            System.out.println(emp_);

            fs.close();
            is.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
