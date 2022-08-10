package classWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable_ {
    static class Movie implements Comparable{

        String name;

        Movie(String name){
            this.name = name;
        }

        @Override
        public int compareTo(Object o) {
            Movie obj = (Movie) o;

            return this.name.compareTo(obj.name);
        }
    }
    public static void main(String[] args){
        System.out.println("Written By Yash");
        List<Movie> mvLst = new ArrayList<Movie>();

        mvLst.add(new Movie("3 Idiots"));
        mvLst.add(new Movie("Burning Train"));
        mvLst.add(new Movie("Sniper"));
        mvLst.add(new Movie("Interstellar"));
        mvLst.add(new Movie("TASM"));


        for(Movie mvObj: mvLst){
            System.out.println(mvObj.name);
        }

        System.out.println();
        Collections.sort(mvLst);

        for(Movie mvObj: mvLst){
            System.out.println(mvObj.name);
        }
    }
}
