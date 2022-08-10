package ass_class_2;

import classWork.Print;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class _57_canbe_58 {
    public static void main(String[] args){
        int ch;
        boolean cont = true;
        Scanner sc = new Scanner(System.in);

        int userId;
        String passwd;
        String Name, Gender, Location;
        String phone_number;

        String query;

        ResultSet rs;

        boolean chck=true;

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            Print.Print("Loaded MYSQL Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/yash","root","mysql");
            Print.Print("Connected with the Database..");

            Statement st = con.createStatement();


            st.execute("Create table User(userId int,passwd varchar(25),Name varchar(25),Gender varchar(25),Location varchar(25),phone_number varchar(25),primary key (userId))");
            Print.Print("Statement executed... Table created");

            while(cont) {
                System.out.println("choice 1 Login \nchoice 2 Register \nchoice 3 terminate\nchoose any one: ");
                ch=sc.nextInt();

                switch(ch) {
                    case 1:
                        System.out.println("Enter userId and password: ");
                        userId = sc.nextInt();
                        passwd = sc.next();

                        rs = st.executeQuery("select * from User where userId="+userId+" and passwd='"+passwd+"'");

                        while (rs.next()) {
                            chck=false;
                        }

                        if(chck){
                            System.out.println("Please Register");
                        }else{
                            cont=false;
                            break;
                        }
                        break;
                    case 2:
                        System.out.println("Enter userId, passwd, Name, Gender, Location, Phone number");
                        userId = sc.nextInt();
                        passwd = sc.next();
                        Name = sc.next();
                        Gender = sc.next();
                        Location = sc.next();
                        phone_number = sc.next();

                        query = "insert into User values('"+userId+"','"+passwd+"','"+Name+"','"+Gender+"','"+Location+"','"+phone_number+"')";
                        st.execute(query);

                        Print.Print("Registered");
                        break;
                    case 3:
                        cont=false;
                        break;
                    default:
                        System.out.println("Select between 1 to 3....");
                }

                System.out.println("Thanks");
            }

            st.execute("drop table User");
            Print.Print("Statement executed... Table dropped");
        }
        catch (Exception e){
            Print.Print(e);
        }
    }
}
