package ass_class_2;

import java.util.Scanner;

public class _14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr;

        int num = sc.nextInt(),small=100000;

        arr = new int[num];

        for(int i=0;i<num;i++) {
            arr[i] = sc.nextInt();
            if(arr[i] < small) {
                small = arr[i];
            }
        }

        System.out.println(small);
    }
}
