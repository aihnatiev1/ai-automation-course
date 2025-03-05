package homework.array;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("FOR EACH");
        int[] numbers = {12, 4, 19, 33, 7};
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
                System.out.println(min);
            }
        }

        System.out.println("FOR");
        int[] numbers2 = {12, 4, 19, 33, 7, 0, -1};
        int min2 = numbers2[0];
        for (int i = 0; i <= numbers2.length - 1; i++) {
            if (numbers2[i] < min2) {
                min2 = numbers2[i];
            }
        }
        System.out.println(min2);

        System.out.println("FOR EACH SUM");
        double[] numbers3 = {1.5, 2.0, 3.7, 4.2, 5.1};
        double sum = 0.0;
        for (double number : numbers3) {
            sum += number;
        }
        System.out.println(sum);

        System.out.println("ARRAY LIST FOR EACH");
        FindMin findMin = new FindMin();
        findMin.checkMin();

        System.out.println("Babble sort max -> min");
        int tempInt;
        boolean flag = true;
        int[] array = {1, 3, 2, 8, 4, -1, 5, 6, 10};
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length -1; i++) {
                if (array[i] < array[i+1]) {
                    tempInt = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tempInt;
                    flag = true;
                }
            }
        }
        for (int item : array) {
            System.out.print(item + " ");
            System.out.println();
        }

        System.out.println("Babble sort max <- min");
        int tempInt1;
        boolean flag1 = true;
        int[] array1 = {1, 3, 2, 8, 4, -1, 5, 6, 10};
        while (flag1) {
            flag1 = false;
            for (int i = 0; i < array1.length -1; i++) {
                if (array1[i] > array1[i+1]) {
                    tempInt1 = array1[i];
                    array1[i] = array1[i+1];
                    array1[i+1] = tempInt1;
                    flag1 = true;
                }
            }
        }
        for (int item : array1) {
            System.out.print(item + " ");
            System.out.println();
        }
    }



    static class FindMin {
        public void checkMin() {
            ArrayList<Integer> numbers1 = new ArrayList<>();
            numbers1.add(12);
            numbers1.add(4);
            numbers1.add(19);
            numbers1.add(33);
            numbers1.add(7);
            numbers1.add(8);
            numbers1.add(9);
            numbers1.add(10);
            numbers1.add(-1);
            numbers1.add(-4);
            numbers1.add(0);
            numbers1.add(54);
            int min1 = numbers1.get(0);
            for (Integer integer : numbers1) {
                if (integer < min1) {
                    min1 = integer;
                }
            }
            System.out.println(min1);
        }
    }
}
