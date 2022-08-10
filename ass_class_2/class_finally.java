package ass_class_2;

import java.util.Scanner;

public class class_finally {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        try{
            System.out.println("Enter the number: ");
            int num= sc.nextInt();
            int div_0 = num/0;
        }catch(Exception e){
            System.out.println("Number divided by 0 raises error!! "+e);
        }finally {
            System.out.println("Release all the resource here...");
        }
    }
}
