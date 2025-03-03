package classwork.loops.homeworkpractice;

public class TimePractice {
    public static void main(String[] args) {
        for (int hour = 0; hour < 24; hour++) {
            for (int min = 0; min < 60; min++) {
                for (int sec = 0; sec < 60; sec++) {
                    System.out.println();
                    System.out.printf("%02d:%02d:%02d", hour, min, sec);
                    System.out.print("");
                }
            }
        }
    }
}
