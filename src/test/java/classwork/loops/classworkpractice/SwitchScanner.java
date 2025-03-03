package classwork.loops.classworkpractice;

import java.util.Scanner;

public class SwitchScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер: ");
        int a = sc.nextInt();
        switch(a) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("Неверно заданный день");

        }
        sc.close();
    }
}
