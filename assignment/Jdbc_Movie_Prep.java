package assignment;

import classWork.Print;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc_Movie_Prep {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Print.Print("Loaded MYSQL Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/yash","root","mysql");
            Print.Print("Connected with the Database..");

            Statement st = con.createStatement();
            Print.Print("Statement Created...");

            PreparedStatement ps = con.prepareStatement("INSERT INTO Movie VALUES (?,?,?,?)");

            Print.Print("Enter Movie id , name, imdb, duration");
            int emp_id = sc.nextInt();
            String name = sc.next();
            float imdb = sc.nextFloat();
            float duration = sc.nextFloat();

            ps.setInt(1,emp_id);
            ps.setString(2,name);
            ps.setFloat(3,imdb);
            ps.setFloat(4,duration);


            ps.execute();
            Print.Print("Data added successfully...");
            Print.Print("Connection closed...");

            con.close();
        }catch(Exception e){
            Print.Print(e);
        }
        sc.close();
    }
}
