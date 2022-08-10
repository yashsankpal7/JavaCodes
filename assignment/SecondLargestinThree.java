package assignment;

import java.util.Scanner;

public class SecondLargestinThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();

        if(one > two) {
            if( one > three) {
                System.out.println((two>three)?two:three);
            }
            else {System.out.println(one);}
        }else {
            if( two > three) {
                System.out.println((three>one)?three:one);
            }
            else {System.out.println(two);}
        }
    }
}
