package assignment;

import classWork.Print;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Jdbc_Procedure {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Print.Print("Loaded MYSQL Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/yash","root","mysql");
            Print.Print("Connected with the Database..");

            CallableStatement cal = con.prepareCall("call insertIntoMovie(?,?,?,?)");

            Scanner sc = new Scanner(System.in);

            Print.Print("Enter ID,Name,Imdb,Duration...");
            int id = sc.nextInt();
            String name = sc.next();
            float imdb = sc.nextFloat();
            float duration = sc.nextFloat();

            cal.setInt(1,id);
            cal.setString(2,name);
            cal.setFloat(3,imdb);
            cal.setFloat(4,duration);

            cal.execute();
            Print.Print("Stored procedure InsertIntoMovie() is executed successfully...");
            con.close();
            Print.Print("Connection Closed...");
        }catch(Exception e){
            Print.Print(e);
        }
    }
}
