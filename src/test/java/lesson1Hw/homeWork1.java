package lesson1Hw;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class homeWork1 {
    @Test
    public void loginFacebookGetPostText(){
        Selenide.open("https://www.facebook.com/");
        $("#email").setValue("tihonob131313@gmail.com");
        $("[id='pass']").setValue("Qwerty_131313");
        $("[name='login']").click();
        // escape first capcha
        $("#email").setValue("tihonob131313@gmail.com");
        $("[id='pass']").setValue("Qwerty_131313");
        $("[name='login']").click();
        Selenide.open("https://www.facebook.com/profile.php?id=61573383269003");
        SelenideElement element = $("[data-ad-rendering-role='story_message']").shouldBe(Condition.visible);
        System.out.println(element.getText());



    }

}
