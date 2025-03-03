package classwork.loops;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$$;

public class IfExample {
    public static void main(String[] args) {
        int num = 10;
        int num1 = 10;
        int num2 = 20;
        int num3 = 35;

//        if (num3 < num2) {
//            System.out.println("num3 больше");
//        }


//        if (num > 20) {
//            System.out.println("Number is greater than 20");
//        } else {
//            System.out.println("Number is less than 20");
//        }

        if (num < 20 && num1 == 10) {
            if (num2 >= 20) {
                System.out.println("Номер равен 20");
            } else {
                System.out.println("Номер меньше 20");
            }
        } else {
            System.out.println("Номер равняется 10");
        }

//        int a = 5;
//        int b = 5;
//        if (a == b){};
//            System.out.println("a и b равны!");
//            else {}
//            System.out.println("a и b не равны!");


        //Сокращенный if
//        if (num > 10)
//            System.out.println("Номер больше 10");
//        else
//            System.out.println("Номер не меньше 10");
//        System.out.println("randon");
    }
}
