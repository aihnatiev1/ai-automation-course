package lesson3HW;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$$x;

public class Task4 {

    @Test
    public void thirdFilm() {
        Selenide.open("https://liniakino.com/showtimes/");
        String thirdFilmName = $$x("//*[@class='showtimes-list']//*[@class='showtime-movie'][3]//h1").get(0).text();
        ElementsCollection dates = $$x("//*[@class='showtimes-list']//*[@class='showtime-movie'][3]//*[@class='date']");
        System.out.println("3-й фільм: " + thirdFilmName);
        System.out.println("-----------------------------");

        for (int i = 0; i < dates.size(); i++) {
            String dateText = dates.get(i).text();
            System.out.println(dateText);
            ElementsCollection cinemas = dates.get(i).$$x(".//following-sibling::div[@class='showtime-theater']");

            for (int j = 0; j < cinemas.size(); j++) {
                String cinemaName = cinemas.get(j).$x(".//label").text();
                ElementsCollection sessions = cinemas.get(j).$$x(".//*[@class='showtime-item']//a");
                StringBuilder sessionTimes = new StringBuilder();
                for (int k = 0; k < sessions.size(); k++) {
                    sessionTimes.append(sessions.get(k).text()).append(", ");
                }
                if (sessionTimes.length() > 0) {
                    sessionTimes.setLength(sessionTimes.length() - 2);
                }
                System.out.println(cinemaName + " - " + sessionTimes);
            }
        }
    }
    @Test
    public void beforeLastFiln() {
        Selenide.open("https://liniakino.com/showtimes/");
        ElementsCollection allMovies = $$x("//*[@class='showtimes-list']//*[@class='showtime-movie']");
        int beforeLastIndex = allMovies.size() - 2;
        String beforeLastFilmName = allMovies.get(beforeLastIndex).$x(".//h1").text();
        ElementsCollection dates = allMovies.get(beforeLastIndex).$$x(".//*[@class='date']");

        System.out.println("Передостанній фільм: " + beforeLastFilmName);
        System.out.println("-----------------------------");

        for (int i = 0; i < dates.size(); i++) {
            String dateText = dates.get(i).text();
            System.out.println(dateText);

            ElementsCollection cinemas = dates.get(i).$$x(".//following-sibling::div[@class='showtime-theater']");

            for (int j = 0; j < cinemas.size(); j++) {
                String cinemaName = cinemas.get(j).$x(".//label").text();
                ElementsCollection sessions = cinemas.get(j).$$x(".//*[@class='showtime-item']//a");
                StringBuilder sessionTimes = new StringBuilder();
                for (int k = 0; k < sessions.size(); k++) {
                    sessionTimes.append(sessions.get(k).text()).append(", ");
                }
                if (sessionTimes.length() > 0) {
                    sessionTimes.setLength(sessionTimes.length() - 2);
                }
                System.out.println(cinemaName + " - " + sessionTimes);
            }
        }
    }
}


