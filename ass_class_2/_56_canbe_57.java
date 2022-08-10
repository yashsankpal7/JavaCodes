package ass_class_2;

import classWork.Print;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class _56_canbe_57 {
    public static void main(String[] args){

        int ch;
        boolean cont = true;
        Scanner sc = new Scanner(System.in);

        String query;

        String polPlan,holName,typeOf;
        int polNum;
        ResultSet rs;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Print.Print("Loaded MYSQL Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/yash","root","mysql");
            Print.Print("Connected with the Database..");

            Statement st = con.createStatement();


            st.execute("Create table Insurance (policy_num int,policy_plan varchar(25),holder_name varchar(25),typeofPayment varchar(25),primary key (policy_num))");
            Print.Print("Statement executed... Table created");

            while(cont) {
                System.out.println("choice 1 Insert \nchoice 2 display \nchoice 3 display by choice \nchoice 4 Update \n choice 5 delete \nchoice 6 terminate\nchoose any one: ");
                ch = sc.nextInt();

                switch (ch) {
                    case 1:
                    {
                        System.out.println("Enter policy_num,policy_plan,holder_name,typeofPayment: ");
                        polNum = sc.nextInt();
                        polPlan = sc.next();
                        holName = sc.next();
                        typeOf = sc.next();

                        query = "insert into Insurance values(" + polNum + ",'" + polPlan + "','" + holName + "','" + typeOf + "')";
                        st.execute(query);
                        Print.Print("Statement executed!!");
                    }
                        break;
                    case 2:
                    {
                        rs = st.executeQuery("SELECT * FROM Insurance");

                        while (rs.next()) {
                            Print.Print("Policy_num: " + rs.getString(1) + " Policy_plan: " + rs.getString(2) + " Holder_name: " + rs.getString(3) + " TypeofPayment: " + rs.getString(4));
                        }
                        Print.Print("Statement executed!!");

                    }
                        break;
                    case 3:
                    {
                        System.out.println("Enter policy_num");
                        polNum = sc.nextInt();
                        query = "select * from Insurance where policy_num=" + polNum;
                        rs = st.executeQuery(query);

                        while (rs.next()) {
                            Print.Print("Policy_num: " + rs.getString(1) + " Policy_plan: " + rs.getString(2) + " Holder_name: " + rs.getString(3) + " TypeofPayment: " + rs.getString(4));
                        }
                        Print.Print("Statement executed!!");
                    }
                        break;
                    case 4:
                    {
                        System.out.println("Enter policy_num");
                        polNum = sc.nextInt();
                        System.out.println("Enter typeofPayment: ");
                        typeOf = sc.next();
                        query = "update Insurance set typeofPayment='" + typeOf + "' where policy_num='" + polNum+"'";

                        st.execute(query);
                        Print.Print("Statement executed!!");
                    }
                        break;
                    case 5:
                    {
                        System.out.println("Enter policy_num");
                        polNum = sc.nextInt();

                        query = "delete from Insurance where policy_num='" + polNum+"'";

                        st.execute(query);
                        Print.Print("Statement executed!!");
                    }
                        break;
                    case 6:
                        cont = false;
                        break;
                    default:
                        System.out.println("Select between 1 to 4....");
                }

                System.out.println("Thanks");
            }
            st.execute("drop table Insurance");
            Print.Print("Statement executed... Table dropped");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
