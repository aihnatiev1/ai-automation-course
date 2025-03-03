package classwork.loops.classworkpractice;

public class For {
    public static void main(String[] args) {

        int num = 5;
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }

        int num2 = 10;
        for (int i = 2; i <= num2; i+=2) {
            System.out.println(i);
        }

        int num3 = 10;
        for (int i = 10; i >=1 ; i--) {
            System.out.println(i);
        }

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = i + sum;
            System.out.println(sum);
        }

        int factor = 1;
        for (int i = 1; i <= 5; i++) {
            factor = i * factor;
            System.out.println(factor);
        }

        OUTER: for (int i = 3; i <= 10; i++) {
             for (int j = 1; j <= 10; j++) {
                if (i * j >= 30) {
                    int sum1 = i * 10;
                    System.out.println(i + "*" + 10 + " = " + sum1);
                    break OUTER;
                }
                int multiplier = i * j;
                System.out.println(i + "*" + j + " = " + multiplier);
            }
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("3*" + i  + " = " + (3*i));
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int j1 = 1; j1 <= i; j1++) {
                System.out.print("*");
            }
            for (int k = 1; k <= i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j1 = i; j1 <= 4; j1++) {
                System.out.print("*");
            }
            for (int k = i; k <= 5; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
