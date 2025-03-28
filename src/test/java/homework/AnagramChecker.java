package homework;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

@Test
public class AnagramChecker {

    public boolean equals(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> charCount1 = new HashMap<>();
        for (char c : str1.toCharArray()) {
            charCount1.put(c, charCount1.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> charCount2 = new HashMap<>();
        for (char c : str2.toCharArray()) {
            charCount2.put(c, charCount2.getOrDefault(c, 0) + 1);
        }
        return charCount1.equals(charCount2);
    }

    public static void main(String[] args) {
        AnagramChecker checker = new AnagramChecker();
        String first = "listen";
        String second = "silent";
        String third = "hello";
        String fourth = "world";

//        System.out.println("silent|listen is anagram - " + first + " and " + second + " -> " + checker.equals(first, second));
            if (checker.equals(first,second)) {
                System.out.println("listen|silent - is anagram");
            } else {
                System.out.println("listen|silent - isn't anagram");
            }
//        System.out.println("hello world is anagram - " + third + " and " + fourth + " -> " + checker.equals(third, fourth));
            if (checker.equals(third,fourth)){
                System.out.println("hello|world - is anagram");
            } else {
                System.out.println("hello|world - isn't anagram");
            }
    }
}