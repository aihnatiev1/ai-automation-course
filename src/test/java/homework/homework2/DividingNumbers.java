package homework.homework2;

public class DividingNumbers {
    int numb1 = 10;
    double numb2 = 20.8;
    int result1 = (int) (numb2 / numb1);
    double result2 = (numb1 / numb2);
}

class Result {
    public static void main(String[] args) {
        DividingNumbers d = new DividingNumbers();
        System.out.println(d.result1);
        System.out.println(d.result2);
    }
}