package assignment;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization_ {
}




class movie implements Serializable
{
    String mname;
    String director;
    String genre;

    public movie(String name,String director, String genre)
    {
        this.mname=mname;
        this.director=director;
        this.genre=genre;
    }

    public String toString()
    {
        return "Name: "+mname+" Director: "+director+ " Genre: "+genre;

    }
}



class p1
{

    public static void main(String []args) throws IOException, ClassNotFoundException
    {
        System.out.println("Developed by Rudra Dev Verma");
        System.out.println();

        movie obj=new movie("RRR","S Rajamouli","Kanada");

        FileOutputStream fo=new FileOutputStream("C:\\Users\\RDV\\Desktop\\Recent\\note1.txt");
        ObjectOutputStream os=new ObjectOutputStream(fo);

        os.writeObject(obj);

        fo.close();
        os.close();

        System.out.println("Serialized successfully");

        FileInputStream fi=new FileInputStream("C:\\Users\\RDV\\Desktop\\Recent\\note1.txt");
        ObjectInputStream oi=new ObjectInputStream(fi);

        movie obj1=(movie) oi.readObject();

        System.out.println(obj1);

    }
}

