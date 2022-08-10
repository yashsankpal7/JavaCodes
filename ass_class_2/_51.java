package ass_class_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _51 {
    public static void main(String[] args) throws ParseException {
        Date dt = new Date();

        SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        SimpleDateFormat ft1 = new SimpleDateFormat("dd / MM / yy");

        System.out.println(ft.format(dt));
        System.out.println("Clone : " + ft.clone());
        System.out.println("Hash Code : " + ft.hashCode());
        System.out.println("Is equal ? : " +ft.equals(new SimpleDateFormat()));
        System.out.println("Use of applyLocalizedPattern(): "+ft.toLocalizedPattern());
        System.out.println(ft1.parse("15 / 06 / 22"));
        ft.set2DigitYearStart(ft1.parse("01 / 01 / 00"));
        System.out.println(ft.get2DigitYearStart());
        System.out.println(ft.toPattern());

        String pat = "EEE, MMM d, ''yy";
        ft.applyLocalizedPattern(pat);
        System.out.println(ft.format(dt));
    }

}
