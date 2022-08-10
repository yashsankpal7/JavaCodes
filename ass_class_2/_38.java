package ass_class_2;

import java.util.HashMap;
import java.util.Scanner;

public class _38 {
    static class InvalidInput extends Exception{
        InvalidInput(String msg){
            super(msg);
        }
    }
    static void checker(String str, double tmp, HashMap<String, Double> map) throws InvalidInput {
        if(map.containsKey(str)) System.out.println("Place: "+str+" Temperature: "+tmp);
        else throw new InvalidInput("");
    }
    public static void main(String[] args) throws InvalidInput{
        Scanner sc = new Scanner(System.in);
        HashMap<String,Double> map = new HashMap<>();

        map.put("Alaska",-50.5);
        map.put("Sahara",50.2);
        map.put("Mumbai",28.9);
        try{
            System.out.println("Enter place name and temperature!!: ");
            String str = sc.next();double tmp = sc.nextDouble();
            checker(str,tmp,map);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            sc.close();
            System.out.println("Final block!!");
        }
    }
}
