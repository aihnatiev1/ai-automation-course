package homework;

import org.testng.annotations.Test;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Homework2Time {

    @Test
    public void currentTime() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss yyyy", Locale.ENGLISH);
        String fomatedTime = format.format(timestamp);
        System.out.println("Current Timestamp: " + fomatedTime);
    }

    @Test
    public void tenYearsAgo() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss yyyy", Locale.ENGLISH);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp.getTime());
        calendar.add(Calendar.YEAR, -10);
        Timestamp tenYearsAgo = new Timestamp(calendar.getTimeInMillis());
        String formattedTimestamp = format.format(tenYearsAgo);
        System.out.println("Ten year ago " + formattedTimestamp);
    }

    @Test
    public void fiveMonthsAgo() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss yyyy", Locale.ENGLISH);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp.getTime());
        calendar.add(Calendar.MONTH, -5);
        Timestamp fiveMonthsAgo = new Timestamp(calendar.getTimeInMillis());
        String formattedTimestamp = format.format(fiveMonthsAgo);
        System.out.println("Five months ago " + formattedTimestamp);
    }

    @Test
    public void Future() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss yyyy", Locale.ENGLISH);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp.getTime());
        calendar.add(Calendar.YEAR, +100);
        Timestamp future = new Timestamp(calendar.getTimeInMillis());
        String formattedTimestamp = format.format(future);
        System.out.println("Date and Time 10 years ago: " + formattedTimestamp);
    }
}


