package ass_class_2;

public class _21 {
    public static void main(String[] args){
        int[] arr={10,5,3,2,4,8,9};
        int r1=0,r2=0,r3=0,r4=0,r5=0,r6=0,r7=0,r8=0,r9=0,r0=0;

        for(int i:arr){
            while(i>0){
                switch (i%10){
                    case 1:
                        r1++;
                        break;
                    case 2:
                        r2++;
                        break;
                    case 3:
                        r3++;
                        break;
                    case 4:
                        r4++;
                        break;
                    case 5:
                        r5++;
                        break;
                    case 6:
                        r6++;
                        break;
                    case 7:
                        r7++;
                        break;
                    case 8:
                        r8++;
                        break;
                    case 9:
                        r9++;
                        break;
                    default:
                        r0++;
                }
                i=i/10;
            }
        }

        System.out.println("0: "+r0);
        System.out.println("1: "+r1);
        System.out.println("2: "+r2);
        System.out.println("3: "+r3);
        System.out.println("4: "+r4);
        System.out.println("5: "+r5);
        System.out.println("6: "+r6);
        System.out.println("7: "+r7);
        System.out.println("8: "+r8);
        System.out.println("9: "+r9);
    }
}
