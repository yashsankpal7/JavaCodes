package ass_class_2;

import java.util.Scanner;

public class _5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num: ");
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
