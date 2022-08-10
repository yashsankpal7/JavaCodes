package classWork;

import java.util.Scanner;

public class MultipleCatchBlock {
    public static void main(String[] args){
        System.out.println("Written By Yash");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x,y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        try{
            System.out.println("Result: "+x/y);
            int[] arr = new int[10];
            arr[11] = 100;
        }catch(NullPointerException e){
            e.printStackTrace();
        }catch(ArithmeticException e){
            e.printStackTrace();
        }catch(Exception e){
            System.out.println("The exception occured: "+e);
        }

        sc.close();
    }
}
