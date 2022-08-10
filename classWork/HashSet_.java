package classWork;

import java.util.HashSet;
import java.util.Set;

public class HashSet_ {
    public static void main(String[] args){
        System.out.println("Written By Yash");
        Set<String> set = new HashSet<String>();

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
