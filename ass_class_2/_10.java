package ass_class_2;

public class _10 {
    static int reverseDigits(int num)
    {
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }

    public static void  main(String []args)
    {
        int n = 4562;
        System.out.println(n+"? Palindrome?"+(reverseDigits(n) == n ? "true" : "false"));
    }
}
