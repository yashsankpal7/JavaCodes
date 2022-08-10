package classWork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc_Prepared {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Print.Print("Loaded MYSQL Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/yash","root","mysql");
            Print.Print("Connected with the Database..");

            Statement st = con.createStatement();
            Print.Print("Statement Created...");

            PreparedStatement ps = con.prepareStatement("INSERT INTO jdbc_emp VALUES (?,?)");

            Print.Print("Enter employee id and name");
            int emp_id = sc.nextInt();
            String name = sc.next();

            ps.setInt(1,emp_id);
            ps.setString(2,name);

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
