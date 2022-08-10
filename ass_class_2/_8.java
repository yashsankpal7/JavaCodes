package ass_class_2;

import java.util.Scanner;

public class _8 {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Num?");
        int num = sc.nextInt();


            boolean isPrime = true;
            for (int j=2; j <= num/2; j++)
            {
                if ( num % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if ( isPrime == true )
            {
                System.out.println("Prime num");
            }else System.out.println("Not a prime");

    }
}
