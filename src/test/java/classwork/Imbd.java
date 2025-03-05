package classwork;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$$;

public class Imbd {

    @Test
    public void openImdb() {
        Selenide.open("https://www.imdb.com/chart/top/");
        ElementsCollection elements = $$(".ipc-metadata-list-summary-item");
        String name = elements.get(0).$("h3").text();
        String rating = elements.get(0).$(".ipc-rating-star--rating").text();
        String link = elements.get(0).$(".ipc-title-link-wrapper").getAttribute("href");
        System.out.println(name);
        System.out.println(rating);
        System.out.println(link);
    }
}
