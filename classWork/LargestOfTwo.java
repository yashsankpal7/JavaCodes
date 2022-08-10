package classWork;

import java.util.Scanner;

public class LargestOfTwo {
    public  static  void main(String[] args){
        System.out.println("Written By Yash");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();

        System.out.println((num1 > num2)?"num1":"num2");
    }
}
