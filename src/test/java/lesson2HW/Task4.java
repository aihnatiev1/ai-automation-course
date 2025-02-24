package lesson2HW;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть рядок: ");
        String input = scanner.nextLine();

        System.out.println("Довжина рядка: " + input.length());

        System.out.println("Перший символ: " + input.charAt(0));
        System.out.println("Останній символ: " + input.charAt(input.length() - 1));

        System.out.println("Верхній регістр: " + input.toUpperCase());
        System.out.println("Нижній регістр: " + input.toLowerCase());

        boolean containsJava = input.contains("Java");
        System.out.println("Чи містить рядок слово 'Java'? " + containsJava);

        String replacedSpaces = input.replace(' ', '_');
        System.out.println("Рядок із заміненими пробілами: " + replacedSpaces);

        String[] words = input.split(" ");
        System.out.print("Слова у зворотному порядку: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");

        }
    }
}
