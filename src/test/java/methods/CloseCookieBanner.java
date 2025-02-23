package methods;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CloseCookieBanner {

    public SelenideElement acceptCookies = $("._4t2a [aria-label='Разрешить все cookie']:not([aria-disabled='true'])");

    public void closeCookiesBannerIfVisible() {
        if (acceptCookies.isDisplayed()) {
            acceptCookies.shouldBe(Condition.visible).click();
        }
    }
}
