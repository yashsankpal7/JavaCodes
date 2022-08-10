package assignment;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp=0;

        while(num!=0) {
            temp*=10;
            temp += num%10;
            num/=10;
        }

        System.out.println(temp);
    }
}
