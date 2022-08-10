package classWork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_ {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Print.Print("Loaded MYSQL Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/yash","root","mysql");
            Print.Print("Connected with the Database..");

            Statement st = con.createStatement();

            //Creating table
            st.execute("Create table jdbc_emp (emp_id INTEGER, name VARCHAR(25))");
            Print.Print("Statement executed... Table created");

//            Insert data into table
            st.execute("INSERT INTO jdbc_emp VALUES(111,'Yash')");
            st.execute("INSERT INTO jdbc_emp VALUES(108,'Zahard')");
            st.execute("INSERT INTO jdbc_emp VALUES(112,'Zahard')");

            Print.Print("Data Inserted...");

            //Update data in a table
            st.execute("UPDATE jdbc_emp SET name='Bam' Where emp_id=112");
            st.execute("UPDATE jdbc_emp SET name='YASH' Where emp_id=111");
            st.execute("UPDATE jdbc_emp SET name='ZHD' Where emp_id=108");

            Print.Print("Data Updated...");

            //delete data into table
            st.execute("DELETE FROM jdbc_emp WHERE name='YASH'");
            st.execute("DELETE FROM jdbc_emp WHERE name='ZHD'");
            st.execute("DELETE FROM jdbc_emp WHERE name='Bam'");

            Print.Print("Data Deleted...");
            con.close();
        }catch(Exception e){
            Print.Print(e);
        }
    }
}
