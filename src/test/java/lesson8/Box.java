package lesson8;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by lolik on 22.01.2018.
 */
public class Box {

    public Box(){
    width = 10;
    height = 20;
    depth = 30;
    }

    public double width;
    public double height;
    public double depth;


    public String getVolume() {
        return "Объём коробки: " + (width * height * depth);
    }

    public void printInfo(){
        System.out.println(getVolume());
    }

    public int fact(int n) {
        int result;
        if (n == 1)
            return 1;
        result = fact(n - 1) * n;
        return result;
    }

    @Test
    public void exampleSoftAssertTest() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Hello", "Hello", "First soft assert failed");
        System.out.println("First out");
        softAssert.assertTrue("Hello".equals("hello"), "Second soft assert failed");
        softAssert.assertTrue("Welcome".equals("welcomeeee"), "Third soft assert failed");
        System.out.println("*** test has finished***");
        softAssert.assertAll();


    }

    @Test
    public void exampleAssertTest() {
        Assert.assertEquals(5, 5);
        Assert.assertNotEquals("Jack", "John", "Names are NOT the same!");
        Assert.assertTrue(5>8);
        Assert.assertFalse(5<8, "Incorrect count result!");
//        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com");
//        Assert.fail(“Fail test”);
    }





    public static void main(String[] args) {
        Box box = new Box();
        box.printInfo();
    }
}
