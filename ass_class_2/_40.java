package ass_class_2;

import java.util.ArrayList;

public class _40 {
    public static void main(String[] args){
        ArrayList<String> lis = new ArrayList<String>();

        //Create
        lis.add("temp");
        lis.add("temp1");
        lis.add("temp11");
        lis.add("temp111");
        lis.add("temp1111");

        //Read
        for(String nm:lis){
            System.out.println(nm);
        }

        System.out.println();

        //Update
        lis.set(0, "yash");

        //Delete
        lis.remove(3);
        lis.get(0);

//        lis.s
        for(String nm:lis){
            nm.length();
            System.out.println(nm);
        }
    }
}
