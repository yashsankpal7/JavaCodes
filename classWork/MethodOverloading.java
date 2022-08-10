package classWork;

public class MethodOverloading {
    MethodOverloading(int num){
        int temp=num,rev=0;

        while(num>0) {
            rev*=10;
            rev+=num%10;
            num/=10;
        }

        if(rev == temp) System.out.println(true);
        else System.out.println(false);
    }

    MethodOverloading(String num){

        boolean check = true;

        for(int i=0;i<num.length()/2;i++) {
            if(num.charAt(i) != num.charAt(num.length()-1-i)) {
                check = false;
                break;
            }
        }

        System.out.println(check);
    }

    public static void main(String[] args) {
        System.out.println("Written By Yash");
        MethodOverloading pd1 = new MethodOverloading(1221);
        MethodOverloading pd2 = new MethodOverloading("1221");
    }
}
