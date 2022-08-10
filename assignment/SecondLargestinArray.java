package assignment;

import java.util.Scanner;

public class SecondLargestinArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr;

        int num = sc.nextInt(),temp;

        arr = new int[num];

        for(int i=0;i<num;i++) {
            arr[i] = sc.nextInt();
        }


        for(int i=0;i<num-1;i++) {
            for(int j=0;j<num-i-1;j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println(arr[num-2]);
    }
}
