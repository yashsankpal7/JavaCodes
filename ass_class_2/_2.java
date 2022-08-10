package ass_class_2;

import java.util.Scanner;

public class _2 {
    public static void main(String[] args){
        System.out.println("Written By Yash");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = sc.nextInt(),cnt=0;

        for(int i=0;cnt<num;i+=2,cnt++) {
            System.out.println(i);
        }
    }
}
