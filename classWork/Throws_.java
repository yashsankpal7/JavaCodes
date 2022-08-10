package classWork;

import java.util.Scanner;

public class Throws_ {
    private int id;
    private String name;
    private String div;

    Throws_(){
        id=0;
        name="Zahard";
        div="D";
    }

    static void display(Throw_ th_) throws NullPointerException{
        if(th_ == null) throw new NullPointerException("Obj is null");
    }
    public static void main(String[] args){
        System.out.println("Written By Yash");
        Throw_ th_ = null;

        try{
            display(th_);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
