package classWork;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args){
        System.out.println("Written By Yash");
        Set<String> set = new TreeSet<String>();

        set.add("Yash");
        set.add("Yash1");
        set.add("Yash11");
        set.add("Yash111");
        set.add("Yash1111");
        set.add("Yash11111");

        for(String name : set) {
            System.out.println(name);
        }
    }
}
