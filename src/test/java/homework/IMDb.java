package homework;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Selenide.$;

@Test
public class IMDb {
    public void Rating() {

        Selenide.open("https://www.imdb.com/chart/top/");
        Selenide.$(".ipc-title-link-wrapper").text();
        Selenide.$(".ipc-rating-star--rating").text();
        Selenide.$("[href=\"/title/tt0111161/?ref_=chttp_t_1\"]").getAttribute("href");
        String text = $(".ipc-title__text").text();
        System.out.println("Film name: " + Selenide.$$(".ipc-title-link-wrapper").texts());
        System.out.println("Rating: " + $(".ipc-rating-star--rating").text());
        System.out.println("URL: " + $("[href=\"/title/tt0111161/?ref_=chttp_t_1\"]").getAttribute("href"));
    }
}
