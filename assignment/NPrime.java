package assignment;

import java.util.Scanner;

public class NPrime {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        for (int i = 2; count < num; i++)
        {

            boolean isPrime = true;
            for (int j=2; j <= i/2; j++)
            {
                if ( i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if ( isPrime == true )
            {
                System.out.println(i);
                count++;
            }
        }

    }
}
