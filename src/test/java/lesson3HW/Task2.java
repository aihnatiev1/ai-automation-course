package lesson3HW;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class Task2 {

    @Test
    public void allFilmsFrom1994() {
        Selenide.open("https://www.imdb.com/chart/top/");
        List<String> films = getFilmsYear();
        for (String film : films) {
            System.out.println(film);
            System.out.println("------------------------------------");
        }
    }
    private List<String> getFilmsYear() {
        return $$(".ipc-metadata-list-summary-item")
                .filterBy(text("1994"))
                .texts();


    }
}
