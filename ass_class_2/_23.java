package ass_class_2;

public class _23 {
    static int reverseDigits(int num)
    {
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }

    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};


        for(int j:arr) System.out.println(j+" Palindrome? "+(reverseDigits(j)==j?"Yep ":"No "));
    }
}

