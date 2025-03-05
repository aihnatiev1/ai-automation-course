package classwork.loops.classworkpractice;

public class LoopsPractice {
    public static void main(String[] args) {
        int[] numbers = {7, 5, 10, 3};
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(min);

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(max);

        int[] numbers1 = {7, 5, 10, 3, 19};
        int min1 = numbers1[0];
        int max1 = numbers1[0];

        for (int i = 1; i < numbers1.length; i++) {
            if (numbers1[i] < min1) {
                min1 = numbers1[i];
            }
            if (numbers1[i] > max1) {
                    max1 = numbers1[i];
            }

        }
        System.out.println(min1 + " " + max1);
    }
}
