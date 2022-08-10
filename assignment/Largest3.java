package assignment;

import java.util.Scanner;

public class Largest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();

        if(one > two) {
            if( one > three) {System.out.println("Largest = "+one);}
            else {System.out.println("Largest = "+three);}
        }else {
            if( two > three) {System.out.println("Largest = "+two);}
            else {System.out.println("Largest = "+three);}
        }
    }
}
