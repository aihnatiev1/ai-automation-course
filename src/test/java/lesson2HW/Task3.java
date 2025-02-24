package lesson2HW;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Task3 {
    public static void main(String[] args) {
        Calendar newCalendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss yyyy");
        System.out.println("Поточна дата: " + dateFormat.format(newCalendar.getTime()));


        newCalendar.add(Calendar.YEAR, - 10);
        System.out.println("Дата 10 років назад: " + dateFormat.format(newCalendar.getTime()));
        newCalendar = Calendar.getInstance();

        newCalendar.add(Calendar.MONTH, - 5);
        System.out.println("Дата 5 місяців назад: " + dateFormat.format(newCalendar.getTime()));
        newCalendar = Calendar.getInstance();

        newCalendar.add(Calendar.YEAR, + 100);
        System.out.println("Дата 100 років вперед: " + dateFormat.format(newCalendar.getTime()));

    }


}
