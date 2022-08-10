package assignment;

import java.util.Scanner;

public class CheckPrime {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num<=1) { System.out.println("No prime");return;}
        boolean isPrime = true;
        for (int i=2; i <= num/2; i++)
        {
            if ( num % i == 0)
            {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime);
    }
}
