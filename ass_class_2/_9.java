package ass_class_2;

import java.util.Scanner;

public class _9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Num?");
        int num = sc.nextInt();
        int temp=0;

        while(num!=0) {
            temp*=10;
            temp += num%10;
            num/=10;
        }

        System.out.println(temp);
    }
}
