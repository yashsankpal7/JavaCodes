package ass_class_2;

import java.util.Date;

public class _48 {
    public static void main(String[] args){
        Date d1 = new Date(2022, 1, 24);
        Date d2 = new Date();  // Current date
        Date d3 = new Date(2022, 12, 24);

        boolean a = d3.after(d1);
        System.out.println("Date d3 comes after date d2: " + a);

        boolean b = d3.before(d2);
        System.out.println("Date d3 comes before date d2: " + b);

        int c = d1.compareTo(d2);
        System.out.println(c);

        System.out.println("Miliseconds from Jan 1 1970 to date d1 is " + d1.getTime());

        System.out.println("Before setting "+d2);
        d2.setTime(204587433443L);
        System.out.println("After setting "+d2);

        System.out.println("HashCode : "+d1.hashCode());
        System.out.println("Instant :"+d1.toInstant());
        System.out.println("Day "+d1.getDay());
        System.out.println("Class "+d1.getClass());
        System.out.println("Timezone "+d1.getTimezoneOffset());
    }
}
