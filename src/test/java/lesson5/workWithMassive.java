package lesson5;

import java.util.Arrays;

public class workWithMassive {
    public static void main(String[] args) {
        int[] intMassive = {12, 4, 19, 33, 7};
        int min = intMassive[0];
        for (int i = 1; i < intMassive.length; i++) {
            if (intMassive[i] < min) {
                min = intMassive[i];
            }
        }
        System.out.println("Min element : " + min);

        double[] doubleMassive = {1.5, 2.0, 3.7, 4.2, 5.1};
        double sum = 0.0;
        for (double num : doubleMassive) {
            sum += num;
        }
        System.out.println("Sum of elements : " + sum);

        bubbleSort(intMassive);
        System.out.println("intMassive reverse: ");
        printReversed(intMassive);

        bubbleSort(doubleMassive);
        System.out.println("doubleMassive reverse: ");
        printReversed(doubleMassive);


        Arrays.sort(intMassive);
        System.out.println("intMassive using (Arrays.sort): " + Arrays.toString(intMassive));

        Arrays.sort(doubleMassive);
        System.out.println("doubleMassive using (Arrays.sort): " + Arrays.toString(doubleMassive));



    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void bubbleSort(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printReversed(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void printReversed(double[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

