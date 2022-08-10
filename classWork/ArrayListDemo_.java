package classWork;


import java.util.ArrayList;

public class ArrayListDemo_ {
    public static void main(String[] args){
        System.out.println("Written By Yash");

        ArrayList<String> lis = new ArrayList<String>();
        lis.add("temp");
        lis.add("temp1");
        lis.add("temp11");
        lis.add("temp111");
        lis.add("temp1111");

        for(String nm:lis){
            System.out.println(nm);
        }
    }
}
