package classwork.loops;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Аня", "Борис", "Вика");
//        for (String name : names) {
//            System.out.println("Имя: " + name);
//        }

        for(int i = 0 ; i < names.size() ; i++){
            System.out.println(names.get(i));
        }
    }
}
