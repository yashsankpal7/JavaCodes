package assignment;

import java.util.Scanner;

public class MergeTwoarray_sort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr1,arr2,arr3;
        int temp;

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();


        arr1 = new int[num1];
        arr2 = new int[num2];
        arr3 = new int[num1+num2];

        for(int i=0;i<num1;i++) {
            arr1[i] = sc.nextInt();
        }

        for(int i=0;i<num2;i++) {
            arr2[i] = sc.nextInt();
        }

        int i=0,j=0,k=0;

        while(i<num1&&j<num2) {
            if(arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            }else {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i<num1) {
            arr3[k] = arr1[i];
            i++;k++;
        }

        while(j<num2) {
            arr3[k] = arr2[j];
            j++;k++;
        }

        for(int i1:arr3) {
            System.out.println(i1);
        }
    }
}

