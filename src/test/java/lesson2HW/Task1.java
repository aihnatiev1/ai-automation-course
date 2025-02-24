package lesson2HW;

public class Task1 {
    public static void main(String[] args) {
        int intValue = 5;
        double doubleValue = 12.34;
        int intValue1 = (int) doubleValue;


        System.out.println("Значення int: " + intValue);
        System.out.println("Значення double: " + doubleValue);
        System.out.println("Неявне приведення: " + (double) intValue);
        System.out.println("Явне приведення: " + intValue1);

    }

}




