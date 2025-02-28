package lesson3HW;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$$;

public class Task3 {

    @Test
    public void topFilms() {
        Selenide.open("https://www.imdb.com/chart/top/");
        ElementsCollection listOfFilms = $$(".ipc-metadata-list li");
      int topFilms = listOfFilms.size();
      for (int i =  topFilms - 10; i < topFilms; i++ ){
          String title = listOfFilms.get(i).$(".ipc-title__text").text();
          String rating = listOfFilms.get(i).$(".ipc-rating-star--rating").text();
          System.out.println("Назва: " + title);
          System.out.println("Рейтинг: " + rating);
          System.out.println("------------------------------------");
      }
    }
}
