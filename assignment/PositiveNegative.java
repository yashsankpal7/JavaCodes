package assignment;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println((num == 0)?"0":(num>0)?"+ve":"-ve");
    }
}

