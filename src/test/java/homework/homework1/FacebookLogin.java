package homework.homework1;

import com.codeborne.selenide.*;
import methods.CloseCookieBanner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class FacebookLogin {

    private final static String URL = "https://www.facebook.com/";

    private final CloseCookieBanner cookies = new CloseCookieBanner();
    @Test
    public void loginInFacebookAndCheckPost() {
        Selenide.open(URL);
        $("#email").val("tester1proxy1band@gmail.com");
        cookies.closeCookiesBannerIfVisible();
        $("#pass").val("qwerty_321_$13");
        $("[type='submit']").shouldBe(Condition.visible).click();
        actions().sendKeys(Keys.ESCAPE).build().perform();
        Selenide.$$("[aria-label='Shortcuts'] li").findBy(Condition.exactText("Aqa Worker")).click();
        Selenide.webdriver().shouldHave(WebDriverConditions.urlContaining(URL + "profile.php?id=61573464806959"));
        $("[data-ad-rendering-role='story_message']")
                .shouldHave(Condition.text("Hello World!"));
        System.out.println(WebDriverRunner.getWebDriver()
                .findElement(By.cssSelector("[data-ad-rendering-role='story_message']")).getText());
    }
}