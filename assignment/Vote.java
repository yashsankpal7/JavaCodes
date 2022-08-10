package assignment;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age: ");
        int vote = sc.nextInt();
        System.out.println((vote < 18)? "not a voter":"voter");
    }
}
