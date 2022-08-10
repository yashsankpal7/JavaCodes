package ass_class_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Class_date {
    public static void main(String[] args){
        System.out.println("Written by Yash");

        Date dt = new Date();

        System.out.println("Current Data Time"+dt);
        SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        System.out.println(ft.format(dt));
    }
}
