package ass_class_2;

import java.util.Scanner;

public class _6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Num ?: ");
        int num = sc.nextInt();

        int n = 1, n_1 = 0,tmp=0;
        boolean flg=false;

        for(int i=0;i<=num;i++) {
            tmp = n;
            n += n_1;
            n_1 = tmp;

            if(n==num){
                flg=true;
                break;
            }
        }

        System.out.println((flg)?"Fib":"Not a fib");
    }
}
