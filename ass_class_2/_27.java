package ass_class_2;

public class _27 {

    static boolean checkPalindrome(int num){
        int rev_num = 0,temp_num=num;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num == temp_num;
    }

    static boolean checkPalindrome(String str){
        int i = 0, j = str.length() - 1;
        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println("Palindrome :"+(checkPalindrome(1001)?"Yes":"No"));
        System.out.println("Palindrome :"+(checkPalindrome("MOM")?"Yes":"No"));
    }
}
