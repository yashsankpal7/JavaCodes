package ass_class_2;

import java.util.Scanner;

public class _36 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            int arr=sc.nextInt();
            System.out.println("Element is: "+arr);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            sc.close();
            System.out.println("Scanner released!!");
        }
    }
}
