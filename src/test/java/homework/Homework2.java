package homework;


//Неявне приведення
public class Homework2 {
    public static void main(String[] args) {

            int i = 3;
            double d = i;
            System.out.println("Test 1: " + d);


            double q = 3.14;
            int t = (int) q;
            System.out.println("Test 2: " + t);


            int g = 3;
            double c = 1.5;
            double result1 = g / c;
            System.out.println("Test 3: " + result1);


            int n = 3;
            double b = 1.5;
            int result2 = (int) (n / b);
            System.out.println("Test 4: " + result2);

    }

}


