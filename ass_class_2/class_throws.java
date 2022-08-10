package ass_class_2;

import java.util.Scanner;

public class class_throws {
    static int div(int num1,int num2) throws ArithmeticException{
        return num1/num2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        try{
            System.out.println("Enter the number: ");
            int num_1= sc.nextInt();
            int num_2= sc.nextInt();

            System.out.println("Result is: "+div(num_1,num_2));
        }catch(Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Release all the resources!!");
        }
    }
}
