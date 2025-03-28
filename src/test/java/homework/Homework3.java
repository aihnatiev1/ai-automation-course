package homework;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

/*
Завдання 1:
    Пошук фільму з рейтингом > 9.2 на IMDb
    Опис:
        На сторінці IMDb Top 250 знайдіть фільм, у якого рейтинг більше за 9.2.
        Виведіть у консоль назву цього фільму та його рейтинг.

Завдання 2: Знайти всі фільми, які вийшли у 1994 році
    Опис:
        На сторінці IMDb знайдіть усі фільми, випущені у 1994 році, і виведіть їх у консоль.

Завдання 3:
    Опис:
        Отримати 10 найкращих фільмів із кінця (назва, рейтинг)

Завдання 4: (кінотеатр)
    За допомогою xPath вивести 3й і передостанній фільм який зараз у прокаті з такими показниками:
    -Назва
    -Коли, у яких кінотетрах і час сеансів
    Формат:
        Їжак Сонік 3
        Сьогодні
        Cherrymall - 10:00, 15:50
        26 лютого, середа
        Cherrymall - 10:00, 15:50 (edited)
 */
public class Homework3 {

    @Test
    public void task1() {

        Selenide.open("https://www.imdb.com/chart/top/");
        ElementsCollection films = $$(".ipc-metadata-list-summary-item");
        String name = films.findBy(text("9.3")).$(".ipc-title--title").getText();
        String rating = films.findBy(text("9.3")).$(".ipc-rating-star--rating").getText();
        System.out.println("Name: " + name + ", Rating: " + rating);
    }

    @Test
    public void task2() {
        Selenide.open("https://www.imdb.com/chart/top/");
        ElementsCollection films = $$(".ipc-metadata-list-summary-item");
//        ElementsCollection year = films.filterBy(text("1994"));
        String year = films.findBy(text("1994")).getText();
        System.out.println("Films: " + year);

    }

//    @Test
//    public void task3 () {
//        Selenide.open("https://www.imdb.com/chart/top/");
//        ElementsCollection films = $$(".ipc-metadata-list-summary-item");
//        String name = films.get(249).$(".ipc-title--title").getText();
//        System.out.println("Films: " + name);
//    }

    @Test
    public void task4 () {
        Selenide.open("https://liniakino.com/showtimes/");
        ElementsCollection thirdFilm = $$x("//*[@class='showtimes-list']//*[@class='showtime-movie'][3]//h1");
        ElementsCollection session = $$x("//*[@class='showtimes-list']//*[@class='showtime-movie'][3]//*[@class='showtime-theater'][1]//label");
        ElementsCollection theatre = $$x("");
        ElementsCollection time = $$x("//*[contains(@class,'showtime-day')][2] ");

        System.out.println(thirdFilm.texts());
        System.out.println(session.texts());
        System.out.println(time.texts());
        System.out.println(theatre.texts());
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