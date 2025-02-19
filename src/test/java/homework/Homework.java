package homework;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class Homework {

    @Test
    public void HomeWork() {
        Selenide.open("https://www.facebook.com/");
        $("[placeholder='Email or phone number']").shouldBe(Condition.visible).setValue("dimakrug1803@gmail.com");
        $("[placeholder='Password']").shouldBe(Condition.visible).setValue("Dimon451263!");
        $("[data-testid='royal-login-button']").shouldBe(Condition.visible).click();
        actions().sendKeys(Keys.ESCAPE).build().perform();
        Selenide.sleep(5000);
        SelenideElement element = $("[data-ad-rendering-role='story_message']").shouldBe(Condition.visible);
        System.out.println(element.getText());
    }
}
