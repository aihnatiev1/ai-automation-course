package lesson1;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.Test;


public class HelloWorld {

    @Test
    public void testHello() {
        Selenide.open("https://www.google.com");
        Selenide.$("[name=q]").setValue("Hello, world!").pressEnter();
        Selenide.sleep(5000);
        Selenide.$("h3").shouldBe(Condition.visible).click();
        System.out.println(WebDriverRunner.getWebDriver().getTitle());
    }
}
