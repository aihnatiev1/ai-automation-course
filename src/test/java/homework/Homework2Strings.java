package homework;
import org.testng.annotations.Test;
import java.util.Scanner;


/*
+++ Отримує від користувача рядок. +++
+++ Виводить довжину цього рядка. +++
+++ Виводить перший і останній символи. +++
+++ Перетворює рядок у верхній і нижній регістр. +++
+++ Перевіряє, чи містить рядок слово "Java". +++
+++ Замінює всі пробіли на підкреслення _. +++
Виводить слова рядка у зворотному порядку. --- (Спасибо чату GPT)
 */

public class Homework2Strings {
    @Test
    public static void main(String[] args) {
        String hello = "Hello Java World!";
        String[] words = hello.split("");
        StringBuilder reverse = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reverse.append(words[i]);
        }
        String result = reverse.toString().trim();

        System.out.println("Upper case: " + hello.toUpperCase());
        System.out.println("Lower case: " + hello.toLowerCase());
        System.out.println("String length : " + hello.length());
        System.out.println("Remove SPACE from string: " + hello.replace(" ", "_"));
        System.out.println("Contains word 'Java': " + hello.contains("Java"));
        System.out.print("First letter: " + hello.charAt(0) + ", ");
        System.out.println("last letters: " + hello.charAt(15));
        System.out.println("Reverse: " + result);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your phone number: ");
        String phoneNumb = scanner.nextLine();
        System.out.println("Your phone number is: " + phoneNumb);
        scanner.close();
    }
}
