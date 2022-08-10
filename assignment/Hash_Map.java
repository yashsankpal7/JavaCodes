package assignment;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
    static class MovieClass{
        String name;

        public MovieClass(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args){
        System.out.println("Written By Yash");

        Map<Integer,MovieClass> map = new HashMap<Integer,MovieClass>();

        map.put(map.size(),new MovieClass("Soul"));
        map.put(map.size(),new MovieClass("Avatar"));
        map.put(map.size(),new MovieClass("TASM"));
        map.put(map.size(),new MovieClass("Tenet"));
        map.put(map.size(),new MovieClass("Rocky"));

        map.forEach((k,v) -> System.out.println(v.name));
    }
}
