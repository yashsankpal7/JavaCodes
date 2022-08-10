package ass_class_2;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _12 {

    static String[] high = {"","","hundred","thousand","lakh"};
    static String[] medium = {"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    static String[] low = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    static String[] exceptional = {"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};

    static class numComp implements Comparator<NumPlace> {
        @Override
        public int compare(NumPlace o1, NumPlace o2) {
            return Integer.compare(o2.place, o1.place);
        }
    }
    static class NumPlace{
        int num;
        int place;

        public NumPlace(int place,int num) {
            this.place = place;
            this.num = num;
        }
    }

    static String NumtoWord(int num){

        int cnt=0;

        PriorityQueue<NumPlace> pQ = new PriorityQueue<NumPlace>(new numComp());

        while (num>0) {
            pQ.add(new NumPlace(cnt,num%10));
            cnt++;
            num=num/10;
        }

        NumPlace e;

        String msg = "";
        while (!pQ.isEmpty()){
            e = pQ.poll();

            switch(e.place){
                case 3:
                    if(e.num > 0) msg = msg+" "+low[e.num]+" "+high[e.place];
                    break;
                case 2:
                    if(e.num > 0) msg = msg+" "+low[e.num]+" "+high[e.place];
                    break;
                case 1:
                    if(e.num > 0) msg = msg+" "+medium[e.num];
                    break;
                default:
                    msg = msg+" "+low[e.num];
            }
        }

        return msg;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = 91;
        System.out.println("Num? "+num);

        System.out.println(NumtoWord(num));
    }
}
