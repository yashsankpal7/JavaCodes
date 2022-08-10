package classWork;

import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args){
        System.out.println("Written By Yash");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        int lar=0;
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
            if(arr[i] > lar) lar=arr[i];
        }
        System.out.println(lar);

    }
}
