import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

public class Lesson1 {

    @Test
    public void testMethod1() {
        Selenide.open();
        System.out.println("This is testMethod1");
    }
}
