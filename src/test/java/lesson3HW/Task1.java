package lesson3HW;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class Task1 {

        @Test
        public void filmWithRating() {

            Selenide.open("https://www.imdb.com/chart/top/");
            ElementsCollection listOfFilms = $$(".ipc-metadata-list li");

            for (SelenideElement film : listOfFilms) {
                String rating = film.$(".ipc-rating-star--rating").getText();
                double rating1 = Double.parseDouble(rating.split("/")[0]);

                if (rating1 > 9.2) {
                    String name = film.$(".ipc-title--title").getText();
                    System.out.println("Назва фільму: " + name);
                    System.out.println("Рейтинг: " + rating1);
                    break;
                }
            }
        }





    }


