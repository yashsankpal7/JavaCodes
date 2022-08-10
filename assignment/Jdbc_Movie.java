package assignment;

import classWork.Print;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc_Movie {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Print.Print("Loaded MYSQL Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/yash","root","mysql");
            Print.Print("Connected with the Database..");

            Statement st = con.createStatement();

            //Creating table
            st.execute("Create table Movie (id INTEGER, name VARCHAR(25),imdb FLOAT(10),duration Float(10))");
            Print.Print("Statement executed... Table created");

//            Insert data into table
            st.execute("INSERT INTO Movie VALUES(111,'Yash',6.5,12.43)");
            st.execute("INSERT INTO Movie VALUES(108,'Zahard',5.5,66.66)");
            st.execute("INSERT INTO Movie VALUES(112,'Zahard',8.8,55.55)");
            st.execute("INSERT INTO Movie VALUES(100,'Logitech',4.5,56.56)");
            st.execute("INSERT INTO Movie VALUES(101    ,'Zahard',7.8,22.36)");
            st.execute("INSERT INTO Movie VALUES(102,'Zahard',6.6,12.12)");

            Print.Print("Data Inserted...");

            //Update data in a table
            st.execute("UPDATE Movie SET name='Bam' Where id=112");
            st.execute("UPDATE Movie SET name='YASH' Where id=111");
            st.execute("UPDATE Movie SET name='ZHD' Where id=108");

            Print.Print("Data Updated...");

            //delete data into table
            st.execute("DELETE FROM Movie WHERE name='YASH'");
            st.execute("DELETE FROM Movie WHERE name='ZHD'");
            st.execute("DELETE FROM Movie WHERE name='Bam'");

            Print.Print("Data Deleted...");

            st.execute("ALTER TABLE Movie ADD Type VARCHAR(25)");
            st.execute("ALTER TABLE Movie MODIFY Type INTEGER");
            st.execute("ALTER TABLE Movie ADD PRIMARY KEY (id)");
            st.execute("ALTER TABLE Movie MODIFY id int NOT NULL");
            st.execute("ALTER TABLE Movie DROP COLUMN Type");

            Print.Print("Data Altered...");

            st.execute("DROP TABLE Movie");

            Print.Print("Table Dropped...");
            con.close();
        }catch (Exception e){
            Print.Print(e);
        }
    }
}
