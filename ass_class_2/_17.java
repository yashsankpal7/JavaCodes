package ass_class_2;

import java.util.Scanner;

public class _17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr;

        int num = sc.nextInt(),temp;

        arr = new int[num];

        for(int i=0;i<num;i++) {
            arr[i] = sc.nextInt();
        }

        int fin = sc.nextInt(),flg=0,i;
        for(i=0;i<num;i++) {
            if(arr[i] == fin) {
                flg = 1;
                break;
            }
        }

        System.out.println((flg==1)?"Found at:"+i:"Not");

    }
}
