package homework;

import org.testng.annotations.Test;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Homework2Time {

    public static void main(String[] args) {

    }

    @Test
    public static void currentTime() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss yyyy", Locale.ENGLISH);
        String fomatedTime = format.format(timestamp);
        System.out.println("Current Timestamp: " + fomatedTime);
    }

    @Test
    public static void tenYearsAgo() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss yyyy", Locale.ENGLISH);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp.getTime());
        calendar.add(Calendar.YEAR, -10);
        Timestamp someTimeAgo = new Timestamp(calendar.getTimeInMillis());
        System.out.println("Ten year ago " + someTimeAgo);
    }

    @Test
    public static void fiveMonthsAgo() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss yyyy", Locale.ENGLISH);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp.getTime());
        calendar.add(Calendar.MONTH, -5);
        Timestamp someTimeAgo = new Timestamp(calendar.getTimeInMillis());
        System.out.println("Five months ago " + someTimeAgo);
    }

    @Test
    public static void tenOYearAgo() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss yyyy", Locale.ENGLISH);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp.getTime());
        calendar.add(Calendar.YEAR, +100);
        Timestamp someTimeAgo = new Timestamp(calendar.getTimeInMillis());
        System.out.println("One hundred year ago " + someTimeAgo);
    }

}


