package classWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_ {
    static class Movie{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
    public static void main(String[] args){
        System.out.println("Written By Yash");
        Map<Integer,Movie> obj = new HashMap<Integer,Movie>();

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

        obj.put(1, m1);
        obj.put(2, m2);
        obj.put(3, m3);
        obj.put(4, m4);
        obj.put(5, m5);

        Set<Map.Entry<Integer,Movie>> obj1 = obj.entrySet();
        for(Map.Entry<Integer,Movie> Obj:obj1) {
            System.out.println(Obj.getKey());
            System.out.println(Obj.getValue().getName());
        }
    }
}
