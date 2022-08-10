package classWork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc_Batch {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Print.Print("Loaded MYSQL Driver...");

            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/yash","root","mysql");
            Print.Print("Connected with the Database..");

            Statement st = con.createStatement();
            Print.Print("Statement Created...");

            st.addBatch("INSERT INTO jdbc_emp VALUES (121,'temp')");
            st.addBatch("INSERT INTO jdbc_emp VALUES (122,'Temp')");
            st.addBatch("INSERT INTO jdbc_emp VALUES (123,'Wemp')");
            st.addBatch("INSERT INTO jdbc_emp VALUES (124,'Zemp')");
            st.addBatch("UPDATE jdbc_emp SET name='Zemp' WHERE name='Tomp'");
            st.executeBatch();

            Print.Print("Batch executed successfully...");
            con.close();
            Print.Print("Connection Closed...");
        }catch (Exception e){
            Print.Print(e);
        }
    }
}
