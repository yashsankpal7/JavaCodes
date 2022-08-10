package assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.*;
import java.util.Set;

public class arrayList {
    static class Movie{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
    public static void main(String[] args) {

        System.out.println("Written By Yash");

        ArrayList<Movie> lis = new ArrayList<Movie>();

        Movie m1 = new Movie();
        m1.setName("temp1");

        Movie m2 = new Movie();
        m2.setName("temp2");

        Movie m3 = new Movie();
        m3.setName("temp3");

        Movie m4 = new Movie();
        m4.setName("temp4");

        Movie m5 = new Movie();
        m5.setName("temp5");

        lis.add(m1);
        lis.add(m2);
        lis.add(m3);
        lis.add(m4);
        lis.add(m5);

        System.out.println(lis.toString());
        lis.remove(1);
        System.out.println(lis.size());
        System.out.println(lis.indexOf(m5));
        System.out.println(lis.lastIndexOf(m2));
        lis.trimToSize();
        System.out.println(lis.subList(2, 4));
        System.out.println(lis.clone());
        System.out.println(lis.isEmpty());
        System.out.println(lis.contains(m3));

        Map<Integer,Movie> obj = new HashMap<Integer,Movie>();

        obj.put(1, m1);
        obj.put(2, m2);
        obj.put(3, m3);
        obj.put(4, m4);
        obj.put(5, m5);

        Set<Entry<Integer,Movie>> obj1 = obj.entrySet();
        for(Entry<Integer,Movie> Obj:obj1) {
            System.out.println(Obj.getKey());
            System.out.println(Obj.getValue().getName());
        }
    }
}

