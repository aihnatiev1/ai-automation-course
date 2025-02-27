package classwork;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.Test;


public class HelloWorld {

    @Test
    public void openChrome() {
        Selenide.open("https://www.google.com.ua/");
        Selenide.$("[name='q']").setValue("Hello, World!").pressEnter();
        Selenide.$("h3").shouldBe(Condition.visible).click();
        System.out.println(WebDriverRunner.getWebDriver().getTitle());
    }
}
