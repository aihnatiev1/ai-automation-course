package homework.homework2;

public class GetStringElements {
    String s = "Java is a programming language";
    int lenght = s.length();
    char index1 = s.charAt(0);
    char index2 = s.charAt(29);
}

class Print {
    public static void main(String[] args) {
        GetStringElements el = new GetStringElements();
        StringBuilder sb = new StringBuilder(el.s);
        sb.reverse();
        System.out.println(el.lenght);
        System.out.println(el.index1);
        System.out.println(el.index2);
        System.out.println(el.s.toLowerCase());
        System.out.println(el.s.toUpperCase());
        System.out.println(el.s.contains("Java"));
        System.out.println(el.s.replace(" ", "_"));
        System.out.println(el.s);
        System.out.println(sb);
    }
}

