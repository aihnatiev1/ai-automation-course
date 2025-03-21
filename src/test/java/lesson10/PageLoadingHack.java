package lesson10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * Created by lolik on 29.01.2018.
 */
public class PageLoadingHack {

    public WebDriver driver;

    @BeforeTest
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.setCapability("pageLoadStrategy", "none");
        driver = new ChromeDriver(options);
    }


    @Test
    public void testTakeScreen() throws IOException, InterruptedException {
        get("https://kismia.com");
        driver.findElement(By.cssSelector("#user-email")).clear();
        driver.findElement(By.cssSelector("#user-email")).sendKeys("loliktest1@mail.ru");
        driver.findElement(By.cssSelector("#user-password")).clear();
        driver.findElement(By.cssSelector("#user-password")).sendKeys("qwe1rty2");
        driver.findElement(By.cssSelector("#sign-in-form .submit")).click();
        Thread.sleep(10000);
        //System.out.println(((JavascriptExecutor) driver).executeScript("return document.readyState"));
    }



    @AfterTest
    public void tearDown(){
        driver.quit();
    }


    public void get(String url){
        driver.get(url);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            wait.until(d -> ((JavascriptExecutor)d).executeScript("return document.readyState").equals("complete"));
        } catch (TimeoutException e){
            System.out.println("LOADING TO LONG.....Stop loading page");
            ((JavascriptExecutor) driver).executeScript("window.stop()");
        }
    }


}
