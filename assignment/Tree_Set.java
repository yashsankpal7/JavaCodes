package assignment;

import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {
    public static void main(String[] args) {
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

        System.out.println("Yash".toString().equals("Yash"));
    }
}
