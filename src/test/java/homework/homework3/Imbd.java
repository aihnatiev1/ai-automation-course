package homework.homework3;

import com.codeborne.selenide.*;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Imbd {

    public SelenideElement movieFilterButton = $("[data-testid='test-chip-id-movie']");
    public SelenideElement ReleaseDateDropdown = $("[data-testid='accordion-item-releaseDateAccordion']");
    public SelenideElement releaseDateStart = $("[data-testid='releaseYearMonth-start']");
    public SelenideElement releaseDateEnd = $("[data-testid='releaseYearMonth-end']");
    public SelenideElement seeResultButton = $("[data-testid='adv-search-get-results']");
    public ElementsCollection resultContainer = $$(".ipc-metadata-list li ");
    public ElementsCollection resultContainerData = $$(".ipc-metadata-list li .dli-title-metadata .dli-title-metadata-item:nth-child(1)");
    public SelenideElement acceptCookiesButton = $("[data-testid='accept-button']");

    public void closeCookieBannerIfVisible() {
        if (acceptCookiesButton.isDisplayed()) {
            acceptCookiesButton.click();
        }
    }

    @Test
    public void findFilmWithSpecificRating() {
        Selenide.open("https://www.imdb.com/chart/top/");
        ElementsCollection listFilms = $$(".ipc-metadata-list li");
        String name = listFilms.findBy(text("9.3")).$(".ipc-title--title").getText();
        String rating = listFilms.findBy(text("9.3")).$(".ipc-rating-star--rating").getText();
        System.out.println(name);
        System.out.println(rating);
    }

    @Test
    public void findFilmWithSpecificRating1() {
        Selenide.open("https://www.imdb.com/chart/top/");
        ElementsCollection listFilms = $$(".ipc-metadata-list li");
        List<SelenideElement> collect = listFilms.stream().filter(el ->
                Double.parseDouble(el.$(".ipc-rating-star--rating").text().trim()) >= 9.0).collect(Collectors.toList());

        collect.forEach(el -> {
            System.out.println(el.$(".ipc-title--title").text());
            System.out.println(el.$(".ipc-rating-star--rating").text());
            System.out.println("___________________________");
        });
    }

    @Test
    public void findFilmOf1994() {
        Selenide.open("https://www.imdb.com/chart/top/");
        List<String> films = Selenide.$$(".ipc-metadata-list-summary-item")
                .filterBy(text("1994"))
                .texts();
        films.forEach(System.out::println);
    }

    @Test
    public void findFilms1994() {
        Selenide.open("https://www.imdb.com/search/title/");
        movieFilterButton.shouldBe(Condition.visible).click();
        actions().moveToElement(ReleaseDateDropdown).perform();
        closeCookieBannerIfVisible();
        ReleaseDateDropdown.shouldBe(Condition.visible).click();
        releaseDateStart.shouldBe(Condition.visible).val("1994-01");
        releaseDateEnd.shouldBe(Condition.visible).val("1994-12");
        seeResultButton.shouldBe(Condition.visible).click();
        List<String> films = new ArrayList<>();
        Selenide.$$(".ipc-metadata-list-summary-item").forEach(el -> {
            if (el.$(".cli-title-metadata-item").text().equals("1994")) {
                films.add(el.$("h3").text());
            }
        });
        System.out.println(films);
    }

    @Test
    public void findLastTopFilms() {
        Selenide.open("https://www.imdb.com/chart/top/");
        List<String> films = Selenide.$$(".ipc-metadata-list-summary-item").last(10).texts();
        films.forEach(System.out::println);
    }

    @Test
    public void findThirdShowFilm() {
        Selenide.open("https://liniakino.com/showtimes/");
        ElementsCollection thirdFilmName = $$x("//*[@class='showtimes-list']//*[@class='showtime-movie'][3]//h1");
        ElementsCollection date = $$x("//*[@class='showtimes-list']//*[@class='showtime-movie'][3]//*[@class='date']");
        ElementsCollection cinema = $$x("//*[@class='showtimes-list']//*[@class='showtime-movie'][3]//*[@class='showtime-theater'][2]//label");
        ElementsCollection session1 = $$x("//*[@class='showtimes-list']//*[@class='showtime-movie'][3]//*[@class='showtime-theater'][2]//*[@class='showtime-item'][1]//a");
        ElementsCollection session2 = $$x("//*[@class='showtimes-list']//*[@class='showtime-movie'][3]//*[@class='showtime-theater'][2]//*[@class='showtime-item'][2]//a");
        ElementsCollection session3 = $$x("//*[@class='showtimes-list']//*[@class='showtime-movie'][3]//*[@class='showtime-theater'][2]//*[@class='showtime-item'][3]//a");
        System.out.println(thirdFilmName.texts());
        System.out.println(date.get(0).getText());
        System.out.println(cinema.get(0).getText() + " " + session1.get(0).text() + " " + session2.get(0).text() + " " + session3.get(0).text());
        System.out.println(date.get(1).getText());
        System.out.println(cinema.get(1).getText() + " " + session1.get(1).text() + " " + session2.get(1).text() + " " + session3.get(1).text());
    }

    @Test
    public void findShowFilmBeforeThenLast() {
        Selenide.open("https://liniakino.com/showtimes/");
        ElementsCollection thirdFilmName = $$x("//*[@class='showtimes-list']//*[@class='showtime-movie'][14]//h1");
        ElementsCollection date = $$x("//*[@class='showtimes-list']//*[@class='showtime-movie'][14]//*[@class='date']");
        ElementsCollection cinema = $$x("//*[@class='showtimes-list']//*[@class='showtime-movie'][14]//*[@class='showtime-theater'][1]//label");
        ElementsCollection session1 = $$x("//*[@class='showtimes-list']//*[@class='showtime-movie'][14]//*[@class='showtime-theater'][1]//*[@class='showtime-item'][1]//a");
        System.out.println(thirdFilmName.texts());
        System.out.println(date.get(0).getText());
        System.out.println(cinema.get(0).getText() + " " + session1.get(0).text());
        System.out.println(date.get(1).getText());
        System.out.println(cinema.get(1).getText() + " " + session1.get(1).text() );
    }
}
