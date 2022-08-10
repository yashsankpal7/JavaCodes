package ass_class_2;

import java.util.Scanner;

public class class_throw {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        try{
            System.out.println("Enter the number: ");
            int num_1= sc.nextInt();
            int num_2= sc.nextInt();

            if(num_2 == 0) throw new ArithmeticException("Divisor cannot be 0!!");
        }catch(Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Release all the resources!!");
        }
    }
}
