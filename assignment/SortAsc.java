package assignment;

import java.util.Scanner;

public class SortAsc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr;
        int temp;

        int num = sc.nextInt();

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

        for(int i:arr) {
            System.out.println(i);
        }
    }
}
