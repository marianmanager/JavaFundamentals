package Third;

import java.util.Calendar;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {

        //o sa facem un exemplu de insearare de ora si data la o lucrare

        Date now = new Date();
        //or sau
        long millis = System.currentTimeMillis();
        now = new Date(millis);
        System.out.println(now);

        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime(); // convertim calendarul in data
        System.out.println(date); // Thu Apr 23 18:06:13 EEST 2020

        // si mai avem un exemplu , convertim data in calendar
        cal.setTime(now);
        System.out.println(Calendar.YEAR);
        System.out.println(Calendar.DAY_OF_YEAR);
        System.out.println(Calendar.WEEK_OF_YEAR);

    }
}
