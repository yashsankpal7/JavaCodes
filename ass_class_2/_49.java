package ass_class_2;

import java.util.Calendar;

public class _49 {
    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        System.out.println("The Current Date is:"+cal.getTime());

        System.out.println("The Current Date is:"+cal.get(Calendar.YEAR));

        System.out.println("Maximum weeks in a year is:"+cal.getMaximum(Calendar.WEEK_OF_YEAR));

        cal.add(Calendar.DATE,-28);
        System.out.println("20 days ago :"+cal.getTime());

        cal.add(Calendar.YEAR,  15);
        System.out.println("The Timezone i:"+cal.getTime());
        System.out.println("The Current Date is:"+cal.getCalendarType());
        System.out.println("Minimum weeks in a year is:"+cal.getMinimum(Calendar.WEEK_OF_MONTH));
        System.out.println("Current MINUTE: " + cal.get(Calendar.MINUTE));
        System.out.println("Current SECOND: " + cal.get(Calendar.SECOND));
    }
}
