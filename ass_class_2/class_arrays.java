package ass_class_2;

import java.util.Scanner;

public class class_arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr;



        System.out.println("Enter the number of elements: ");

        int num = sc.nextInt();
        arr = new int[num];

        System.out.println("Enter "+num+"elements: ");
        for(int i=0;i<num;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<num;i++) {
            System.out.println(arr[i]);
        }

    }
}
