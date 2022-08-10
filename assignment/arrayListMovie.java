package assignment;

import java.util.ArrayList;
import java.util.List;

public class arrayListMovie {
    static class Movie{
        String name,Lang,imdb;

        public Movie(String name,String Lang,String imdb){
            this.name = name;
            this.Lang = Lang;
            this.imdb = imdb;
        }
        public String toString(){
            return "Movie: "+this.name+" Lang: "+this.Lang+" Imdb: "+this.imdb;
        }
    }

    public static void main(String[] args){
        System.out.println("Written By Yash");

        List<Movie> lst = new ArrayList<Movie>();

        lst.add(new Movie("Soul","Eng","8"));
        lst.add(new Movie("Morgan","Eng","5"));
        lst.add(new Movie("Money","Hindi","6"));
        lst.add(new Movie("Big Short","Eng","7"));
        lst.add(new Movie("Voioita","French","4"));

        for(Movie mv:lst){
            System.out.println(mv);
        }
    }
}
