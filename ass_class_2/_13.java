package ass_class_2;

import java.util.Scanner;

public class _13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Num?");
        int num = sc.nextInt();

        int r500=0,r200=0,r100=0,r50=0,r20=0,r10=0,r5=0,r2=0,r1=0;

        while (num>0){
            if(num > 500) {
                ++r500;
                num-=500;
            }else if(num > 200){
                ++r200;
                num-=200;
            }else if(num > 100){
                ++r100;
                num-=100;
            }else if(num > 50){
                ++r50;
                num-=50;
            }else if(num > 10){
                ++r10;
                num-=10;
            }else if(num > 5){
                ++r5;
                num-=5;
            }else if(num > 2){
                ++r2;
                num-=2;
            }else{
                r1++;
                num--;
            }
        }

        System.out.println("500: "+r500+" 200: "+r200+" 100: "+r100+" 50: "+r50+" 20: "+r20+" 10: "+r10+" 5: "+r5+" 2: "+r2+" 1: "+r1);
    }
}
