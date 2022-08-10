package assignment;

import java.util.Scanner;

public class EvenOddInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(),cnt=0;

        for(int i=0;cnt<num;i+=2,cnt++) {
            System.out.println(i);
        }

        cnt=0;
        for(int i=1;cnt<num;i+=2,cnt++) {
            System.out.println(i);
        }
    }
}
