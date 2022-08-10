package assignment;

import java.util.HashSet;
import java.util.Set;

public class Hash_Set {
    public static void main(String[] args) {
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
