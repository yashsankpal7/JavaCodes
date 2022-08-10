package classWork;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        System.out.println("Written By Yash");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}
