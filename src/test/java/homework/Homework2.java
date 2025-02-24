package homework;

import org.testng.annotations.Test;

import java.sql.Timestamp;

@Test
//Неявне приведення
public class Homework2 {
    public static void main() {
//        int i = 3;
//        double d = i;
//        System.out.println("Task 1: " + d);
    }
    @Test
    public void di () {
        int i = 3;
        double d = i;
        System.out.println("Test 1: " + d);
    }

    public void doubleToInt() {
        double q = 3.14;
        int t = (int) q;
        System.out.println("Test 2: " + t);
    }

    public void operation1() {
        int g = 3;
        double c = 1.5;
        double result = g / c;
        System.out.println("Test 3: " + result);
    }

    public void operation2() {
        int g = 3;
        double c = 1.5;
        int result = (int) (g / c);
        System.out.println("Test 4: " + result);
    }

}


