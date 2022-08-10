package classWork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc_Select {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Print.Print("Loaded MYSQL Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/yash","root","mysql");
            Print.Print("Connected with the Database..");

            Statement st = con.createStatement();
            Print.Print("Statement Created...");

            ResultSet rs = st.executeQuery("SELECT * FROM jdbc_emp");

            while (rs.next()){
                Print.Print("ID: "+rs.getInt("emp_id")+" Name: "+rs.getString("name"));
            }

            con.close();
        }catch(Exception e){
            Print.Print(e);
        }
    }
}
