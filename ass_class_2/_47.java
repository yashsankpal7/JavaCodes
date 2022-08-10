package ass_class_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _47 {
    static class Movie_{
        String name,lang;
        int id;

        Movie_(String name,String lang,int id){
            this.name = name;
            this.lang = lang;
            this.id = id;
        }
    }

    static class sortName implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {

            Movie_ obj1 = (Movie_) o1;
            Movie_ obj2 = (Movie_) o2;
            return obj1.name.compareTo(obj2.name);
        }
    }

    static class sortLang implements  Comparator{

        @Override
        public int compare(Object o1, Object o2) {

            Movie_ obj1 = (Movie_) o1;
            Movie_ obj2 = (Movie_) o2;
            return obj1.lang.compareTo(obj2.lang);
        }
    }

    static class sortId implements Comparator{

        @Override
        public int compare(Object o1, Object o2) {

            Movie_ obj1 = (Movie_) o1;
            Movie_ obj2 = (Movie_) o2;

            return Integer.compare(obj1.id, obj2.id);
        }
    }

    public static void main(String[] args){
        List<Movie_> lst = new ArrayList<Movie_>();


        lst.add(new Movie_("Soul","Eng",2));
        lst.add(new Movie_("Avatar","Hindi",1));
        lst.add(new Movie_("King Kong","Eng",5));
        lst.add(new Movie_("Demon Slayer","Mandarin",4));
        lst.add(new Movie_("Tarzan","Japanese",3));

        for(Movie_ mvObj: lst){
            System.out.println(mvObj.id+" "+mvObj.name+" "+mvObj.lang);
        }
        System.out.println();

        Collections.sort(lst,new sortId());
        for(Movie_ mvObj: lst){
            System.out.println(mvObj.id+" "+mvObj.name+" "+mvObj.lang);
        }
        System.out.println();

        Collections.sort(lst,new sortName());
        for(Movie_ mvObj: lst){
            System.out.println(mvObj.id+" "+mvObj.name+" "+mvObj.lang);
        }
        System.out.println();

        Collections.sort(lst,new sortLang());
        for(Movie_ mvObj: lst){
            System.out.println(mvObj.id+" "+mvObj.name+" "+mvObj.lang);
        }
        System.out.println();
    }
}
