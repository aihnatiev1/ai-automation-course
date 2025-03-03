package classwork.loops.classworkpractice;

import java.util.Scanner;

public class SeasonsPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        int month = sc.nextInt();
//        int month = 1;
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Зима");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Весна");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Лето");
        } else {
            System.out.println("Осень");
        }
        sc.close();
    }
}
