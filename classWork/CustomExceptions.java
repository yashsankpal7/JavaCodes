package classWork;
class InsufficientBalanceException extends Exception {


    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}
public class CustomExceptions {
    private int cash = 0;

    CustomExceptions(int InitialAmount){
        cash = InitialAmount;
    }
    void deposit(int Val) {
        cash += Val;
    }

    void withdraw(int Val) {
        try{
            if(cash < Val) throw new InsufficientBalanceException("Not sufficient balance!");
            cash -= Val;
        }catch (InsufficientBalanceException ex){
            System.out.println(ex);
        }
    }

    void display() {
        System.out.println("Balance : "+cash);
    }
    public static void main(String[] args){
        System.out.println("Written By Yash");
        CustomExceptions cx = new CustomExceptions(100);
        cx.withdraw(1000);
    }
}
