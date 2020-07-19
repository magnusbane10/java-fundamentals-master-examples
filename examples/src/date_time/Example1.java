package date_time;

import java.util.Calendar;
import java.util.Date;

public class Example1 {

    public static void main(String[] args) {

        Date now = new Date();
        // or
        long millis = System.currentTimeMillis();
        now = new Date(millis);
        System.out.println(now); // Wed Mar 13 21:38:09 CET 2019

        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime(); // convert Calendar to Date
        System.out.println(date); // Wed Mar 13 21:38:09 CET 2019

        cal.setTime(now); // convert Date to Calendar
        System.out.println(cal.get(Calendar.YEAR)); // 2019
        System.out.println(cal.get(Calendar.DAY_OF_YEAR)); // 72
        System.out.println(cal.get(Calendar.WEEK_OF_YEAR)); // 11

    }

}
