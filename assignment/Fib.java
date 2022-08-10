package assignment;

import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int n = 1, n_1 = 0,tmp=0;

        for(int i=0;i<num;i++) {
            System.out.println(n_1);
            tmp = n;
            n += n_1;
            n_1 = tmp;
        }
    }
}
