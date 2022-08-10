package ass_class_2;

import java.util.Scanner;

public class class_CustomException {
    static class AgeException extends Exception{
        AgeException(String msg){
            super(msg);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter age: ");
            int vote = sc.nextInt();

            if(vote < 18)
                throw new _37.AgeException("Not a valid voter!!");
            else
                System.out.println("Voter");

        }catch (Exception e){
            System.out.println(e);
        }finally {
            sc.close();
            System.out.println("Closed!!");
        }
    }
}
