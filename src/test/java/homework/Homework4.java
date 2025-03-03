package homework;

import org.testng.annotations.Test;

public class Homework4 {

    @Test
    public void task1() {
        int a = -5;
        int b = 2;
        int c = 3;
        int d = 4;
        int minNum = a;
        if (b < a) {
            minNum = b;
        }
        if (c < a) {
            minNum = c;
        }
        if (d < a) {
            minNum = d;
        }
        System.out.println("The smallest num is: " + minNum);

    }

    @Test
    public void task2() {
        int a = -9;
        int b = 17;
        int c = 3;
        int d = 4;
        int maxNum = d;
        if (b > maxNum) {
            maxNum = b;
        }
        if (c > maxNum) {
            maxNum = c;
        }
        if (d > maxNum) {
            maxNum = a;
        }
        System.out.println("The greatest num is: " + maxNum);
    }

    @Test
    public void task3() {
        int a = 13;
        int b = 3;
        int c = -10;
        int d = 0;
        int e = -3;
        int maxNum = a;
        int minNum = c;
        if (b > a){
            maxNum = b;
        } else if (b < c) {
            minNum = b;
        }
        if (d > a){
            maxNum = d;
        } else if (d < c){
            minNum = d;
        }
        if (e > a){
            maxNum = e;
        } else if (e < c) {
            minNum = e;
        }
        System.out.println("The smallest num is: " + minNum);
        System.out.println("The greatest num is: " + maxNum);
    }

    @Test
    public void task4() {
        String name1 = new String("John");
        String name2 = new String("Paul");
        if (name1.equals(name2)) {
            System.out.println("Same names");
        }else {
            System.out.println("Different names");
        }
    }

//    @Test
//    public void task5() {
//        int day;
//
//    }
}
