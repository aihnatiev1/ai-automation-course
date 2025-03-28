package homework;

import org.testng.annotations.Test;

public class ArraysHW5 {

    @Test
    public void task1task2() {
        int[] intNumbers = {12, 4, 19, 33, 7};
        double[] doubleNumbers = {1.5, 2.0, 3.7, 4.2, 5.1};
        int minInt = intNumbers[0];
        double sumDouble = 0.0;
        //Min&Max Integer
        for (int i : intNumbers) {
            if (i < minInt)
                minInt = i;
        }
        //Sum
        for (int i = 0; i < doubleNumbers.length; i++) {
            sumDouble += doubleNumbers[i];
        }
        System.out.println("Minimum Integer: " + minInt);
        System.out.println("Summ: " + sumDouble);
    }

    @Test
    public void sorting() {
        int[] intNumbers = {12, 4, 19, 33, 7, 3, 6, 8, 1, 2, 5, 76, 98, 67, 122, 43, 55};
    }









    //Classwork
    @Test
    public static void main(String[] args) {
        int a[] = {1,2,3};
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        char b[] = {'a','b','1'};
        boolean bool[] = {true,true,false};
    }

    @Test
    public void arrayLes() {
        int ar[] = {2,3,-1,6,6,6,7,8,9,0,1111};
        int max = 0;
        int min = 0;
        for (int i : ar) {
            if (i > max)
                max = i;
            if ( i < min)
                min = i;
        }
        System.out.println("Max int in array: " + max);
        System.out.println("Min int in array: " + min);
    }

    @Test
    public void intArray() {
        int arName[] = {1,3,5,8,9,10};
        char charAr[] = {'1','3','5','8','j','G'};

        for (int i = 0; i < arName.length; i++) {
            System.out.println(arName[i] + "");
        }

        for (char i = 0; i < charAr.length; i++){
            System.out.println(charAr[i] + "");
        }
        System.out.println("End");
    }
}
