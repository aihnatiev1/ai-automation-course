package homework;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Collections {

    @Test
    public void unique() {
        String hello = "hello world";
        Set<Character> uniqLetters = new HashSet<>();
        int i;
        for (i = 0; i < hello.length(); i++) {
            uniqLetters.add(hello.charAt(i));
        }

        System.out.println("Unique letters: " + uniqLetters);
    }

    @Test
    public void fruitsCount(){
        String[] fruits = {"apple", "banana", "apple", "orange", "banana", "apple"};
        Map<String, Integer> nameCount = new HashMap<>();

        for (String fruit : fruits) {
            if (nameCount.containsKey(fruit)) {
                nameCount.put(fruit, nameCount.get(fruit) + 1);
            } else {
                nameCount.put(fruit, 1);
            }
        }
        System.out.println("Count of fruits by name: " + nameCount);
    }
//fgdslpkgpiojosdf[gafsgfgdsg
}
