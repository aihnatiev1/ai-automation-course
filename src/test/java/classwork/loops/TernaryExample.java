package classwork.loops;

public class TernaryExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int maximum = (a > b) ? a : b;
        System.out.println(maximum);

        int x = 8;
        String result = (x > 10) ? "Больше 10" : "10 или меньше" ;
        System.out.println(result);
    }
}
