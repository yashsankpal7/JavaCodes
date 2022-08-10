package ass_class_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _50 {
    public static void main(String[] args) throws ParseException {
        Date dt = new Date();

        SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        SimpleDateFormat ft1 = new SimpleDateFormat("EEE, MMM d, ''yy");
        SimpleDateFormat ft11 = new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa");
        SimpleDateFormat ft111 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
        SimpleDateFormat ft1111 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

        SimpleDateFormat _ft = new SimpleDateFormat("yyyy.MM.dd G 'at' hh:mm aaa");
        SimpleDateFormat _ft1 = new SimpleDateFormat("EEE, MMM d, ''yy HH:mm:ss.SSSXXX");
        SimpleDateFormat _ft11 = new SimpleDateFormat("yyyyy.MMMMM.dd GGG HH:mm:ss z");
        SimpleDateFormat _ft111 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss.SSSZ");
        SimpleDateFormat _ft1111 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss z");

        SimpleDateFormat __ft = new SimpleDateFormat("YYYY-'W'ww-u");
        SimpleDateFormat __ft1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        SimpleDateFormat __ft11 = new SimpleDateFormat("yyMMddHHmmssZ");
        SimpleDateFormat __ft111 = new SimpleDateFormat("K:mm a, z");
        SimpleDateFormat __ft1111 = new SimpleDateFormat("hh 'o''clock' a, zzzz");

        SimpleDateFormat ___ft = new SimpleDateFormat("YYYY-'W'ww-u G 'at' HH:mm:ss z");
        SimpleDateFormat ___ft1 = new SimpleDateFormat("EEE,d MMM , ''yy HH:mm:ss z");
        SimpleDateFormat ___ft11 = new SimpleDateFormat("yyyyy.MMMMM.dd GGG HH:mm:ss.SSSXXX");
        SimpleDateFormat ___ft111 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss.SSSXXX");
        SimpleDateFormat ___ft1111 = new SimpleDateFormat("YYYY-'W'ww-u'T'hh:mm aaa");


        System.out.println(ft.format(dt));
        System.out.println(ft1.format(dt));
        System.out.println(ft11.format(dt));
        System.out.println(ft111.format(dt));
        System.out.println(ft1111.format(dt));

        System.out.println(_ft.format(dt));
        System.out.println(_ft1.format(dt));
        System.out.println(_ft11.format(dt));
        System.out.println(_ft111.format(dt));
        System.out.println(_ft1111.format(dt));

        System.out.println(__ft.format(dt));
        System.out.println(__ft1.format(dt));
        System.out.println(__ft11.format(dt));
        System.out.println(__ft111.format(dt));
        System.out.println(__ft1111.format(dt));

        System.out.println(___ft.format(dt));
        System.out.println(___ft1.format(dt));
        System.out.println(___ft11.format(dt));
        System.out.println(___ft111.format(dt));
        System.out.println(___ft1111.format(dt));
    }
}
