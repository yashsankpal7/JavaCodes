package classWork;

import java.util.Scanner;

public class ArrayAndDisplay {
    public static void main(String[] args){
        System.out.println("Written By Yash");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        for(int i:arr){
            System.out.println(i);
        }
    }
}
