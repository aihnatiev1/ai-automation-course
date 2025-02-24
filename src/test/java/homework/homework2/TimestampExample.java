package homework.homework2;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimestampExample {
    public static void main(String[] args) {
        Timestamp t = new Timestamp(System.currentTimeMillis());
        Calendar cal = Calendar.getInstance();
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        String currentDate = new SimpleDateFormat("EEE MMM dd HH:mm:ss yyyy").format(t).toUpperCase();
        cal.add(Calendar.YEAR, -10);
        cal1.add(Calendar.MONTH, -5);
        cal2.add(Calendar.YEAR, +100);
        System.out.println(currentDate);
        System.out.println(cal.getTime());
        System.out.println(cal1.getTime());
        System.out.println(cal2.getTime());
    }
}