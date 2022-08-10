package ass_class_2;

public class _20 {
    static boolean checkPrime(int num){
        for (int j=2; j <= num/2; j++)
        {
            if ( num % j == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr={10,5,3,2,4,8,9};

        for(int i:arr){
            System.out.println(i+" is prime? "+(checkPrime(i)?"true":"false"));
        }
    }
}
