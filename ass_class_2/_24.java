package ass_class_2;

public class _24 {
    static boolean isPalindrome(String str)
    {
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
        String[] arr ={"Yash","ash","shaahs","nnnnn"};


        for(String j:arr)  System.out.println(j+" Palindrome? "+(isPalindrome(j)?"Yep ":"No "));
    }
}
