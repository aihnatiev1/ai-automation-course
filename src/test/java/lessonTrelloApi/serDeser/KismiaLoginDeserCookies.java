package lessonTrelloApi.serDeser;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import java.util.Set;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;


public class KismiaLoginDeserCookies {


    @Test
    public void saveCookies() {
        // Save Cookies to file
        Selenide.open("https://kismia.com/login");
        $("[class*=PopupContainer_content] [data-e2e=button_inner]").shouldBe(visible).click();
        $("[type=email]").shouldBe(visible).val("tester6753@gmail.com");
        $("[type=password]").shouldBe(visible).val("Password123");
        $("[type=submit]").shouldBe(visible).click();
        Selenide.sleep(3000);
        Set<Cookie> cookies = WebDriverRunner.getWebDriver().manage().getCookies();
        SerializationWorker.serializeStorage(cookies, "kismiaCookies");
    }

    @Test
    public void loadCookies() throws InterruptedException {
        Selenide.open("https://kismia.com/");

        Set<Cookie> cookies = (Set<Cookie>) SerializationWorker.deserializeStorage("kismiaCookies");
        for (Cookie cookie : cookies) {
            WebDriverRunner.getWebDriver().manage().addCookie(cookie);
        }
        // Open Page with Cookies
        Selenide.open("https://kismia.com/");
        $("[class*=PopupContainer_content] [data-e2e=button_inner]").shouldBe(visible).click();
        Thread.sleep(10000);
    }


}
