package classWork;

public class ArithmeticException_ extends Throwable {
    static void Arithmetic() {
        System.out.println("Written By Yash");
        try {
            int a = 30, b = 0;
            int c = a/b;  // cannot divide by zero
            System.out.println ("Result = " + c);
        }
        catch(java.lang.ArithmeticException e) {
            System.out.println ("Can't divide a number by 0");
        }
    }
    public static void main(String[] args){
        Arithmetic();
    }
}
