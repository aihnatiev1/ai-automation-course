package homework;

import org.testng.annotations.Test;

import java.util.Scanner;

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

    @Test
    public void task5() {
        int months = 1;
        String season = getSeason(months);
        System.out.println("Month: " + months + ", Season: " + season);
    }

    private String getSeason(int months) {
        switch (months) {
            case 12:
            case 1:
            case 2:
                return "Winter";
            case 3:
            case 4:
            case 5:
                return "Spring";
            case 6:
            case 7:
            case 8:
                return "Summer";
            case 9:
            case 10:
            case 11:
                return "Outumn";
            default:
                return "Wrong month!";
        }

    }

    @Test
    public void task6() {
        int dayNum = 7;
        String dayName = getDays(dayNum);
        System.out.println("It's " + dayName + "!");
    }

    private String getDays(int dayNum) {
        switch (dayNum) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Wrong day!";

        }

    }

    @Test
    public void task7() {

    }
}