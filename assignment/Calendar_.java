package assignment;

import java.util.Calendar;

public class Calendar_ {
    public static void main(String[] args){

        System.out.println("Written By Yash");

        Calendar cal = Calendar.getInstance();
        System.out.println("The Current Date is:"+cal.getTime());

        System.out.println("The Current Date is:"+cal.get(Calendar.YEAR));

        System.out.println("Maximum weeks in a year is:"+cal.getMaximum(Calendar.WEEK_OF_YEAR));

        cal.add(Calendar.DATE,-28);
        System.out.println("20 days ago :"+cal.getTime());

        cal.add(Calendar.YEAR,  15);
        System.out.println("The Timezone i:"+cal.getTime());
        System.out.println("The Current Date is:"+cal.getCalendarType());
    }
}
