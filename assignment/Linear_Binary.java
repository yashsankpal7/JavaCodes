package assignment;

import java.util.Scanner;

public class Linear_Binary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr;
        int num = sc.nextInt();
        int check = sc.nextInt();
        int index=0;

        boolean flg=false;

        arr = new int[num];

        for(int i=0;i<num;i++) {
            arr[i] = sc.nextInt();
        }



        for(int i=0;i<num;i++) {
            if(check == arr[i]) {
                flg=true;
                index=i;
                break;
            }
        }

        System.out.println((flg)?"Found "+index:"Not Found");
        flg=false;

        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            if (arr[m] == check) {
                flg=true;
                break;
            }

            if (arr[m] < check)
                l = m + 1;


            else
                r = m - 1;
        }

        System.out.println((flg)?"Found "+index:"Not Found");
    }
}
