package assignment;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_ {
    public static void main(String[] args) {
        System.out.println("Written by YashSS");

        Date dt = new Date();

        SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        SimpleDateFormat ft1 = new SimpleDateFormat("EEE, MMM d, ''yy");
        SimpleDateFormat ft11 = new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa");
        SimpleDateFormat ft111 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
        SimpleDateFormat ft1111 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

        System.out.println(ft.format(dt));
        System.out.println(ft1.format(dt));
        System.out.println(ft11.format(dt));
        System.out.println(ft111.format(dt));
        System.out.println(ft1111.format(dt));
    }
}
