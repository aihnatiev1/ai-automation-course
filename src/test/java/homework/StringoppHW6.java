package homework;

import org.testng.annotations.Test;

public class StringoppHW6 {
    @Test
    public void string() {
        int num;
        String toInt = "1";
        num = Integer.valueOf(toInt);
        System.out.println(num);
    }
    //30 minuta video
    @Test
    public void primitives() {
        int i = 1;
        boolean b = true;
        double d = 1.3;
        long l = 456484864;

        String intString = Integer.toString(i);
        String booString = Boolean.toString(b);
        String douString = Double.toString(d);
        String longString = Long.toString(l);

        int i2 = Integer.parseInt(intString);
        boolean b2 = Boolean.parseBoolean(booString);
        double d2 = Double.parseDouble(douString);
        long l2 = Long.parseLong(longString);

        System.out.println("First: " + i + ", " + b + ", " + d+ ", " + l);
    }
}
