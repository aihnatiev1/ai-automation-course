package lesson10.listenerExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by lolik on 29.01.2018.
 */
public class DriverWithListenerExample {
    public WebDriver driver;



    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
//        driver = new EventFiringWebDriver(driver).register(new DriverEventListener());
    }

    @Test
    public void lalall() throws InterruptedException {
        driver.get("https://kismia.com");
        driver.findElement(By.cssSelector("#user-email")).clear();
        driver.findElement(By.cssSelector("#user-email")).sendKeys("email@asas.com");
        driver.findElement(By.cssSelector("#user-password")).clear();
        driver.findElement(By.cssSelector("#user-password")).sendKeys("qwerty");
        driver.findElement(By.cssSelector("#sign-in-form .submit")).click();
        Thread.sleep(5000);
        Assert.assertTrue(driver.getCurrentUrl().contains("kismia.com/u"), "Wrong PAGE: "+driver.getCurrentUrl());
    }



    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
