package assignment;

import java.util.Scanner;


class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}
public class BankException {
    private int cash = 0;

    BankException(int InitialAmount){
        cash = InitialAmount;
    }
    void deposit(int Val) {
        cash += Val;
    }

    void withdraw(int Val) throws InsufficientBalanceException{
        if(cash < Val) throw new InsufficientBalanceException("Not sufficient balance!");
        cash -= Val;
    }

    void display() {
        System.out.println("Balance : "+cash);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankException acc = new BankException(1000);
        boolean flg = true;
        while(flg) {
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Display");
            System.out.println("4.Features");
            System.out.println("5.Exit");
            System.out.println("Enter number: ");
            switch(sc.nextInt()) {
                case 1:
                    System.out.println("Enter number: ");
                    acc.deposit(sc.nextInt());
                    break;
                case 2:
                    try {
                        System.out.println("Enter number: ");
                        acc.withdraw(sc.nextInt());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }finally{
                        System.out.println("Job done");
                    }
                    break;
                case 3:
                    acc.display();
                    break;
                case 4:
                    System.out.println(" FD/RD/Bank Transfer/net banking");
                    break;
                case 5:
                    flg = false;
                    break;
                default:
                    System.out.println("Enter 1-5");
            }
        }
    }
}
