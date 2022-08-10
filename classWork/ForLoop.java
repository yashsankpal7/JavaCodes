package classWork;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){
        System.out.println("Written By Yash");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = sc.nextInt();

        for(int i=0;i<num;i++){
            System.out.println(i+1);
        }
    }
}
