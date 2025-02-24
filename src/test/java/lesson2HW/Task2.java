package lesson2HW;

public class Task2 {
    public static void main(String[] args) {
        int intV1 = 100;
        double doubleV1 = 2.55;

        double resultV1 = intV1 / doubleV1;
        int resultV2 = intV1 / (int) doubleV1;

        System.out.println("При діленні int на double результат буде double: " + resultV1);
        System.out.println("При діленні int на int результат залишиться типу int: " + resultV2);


    }

}
