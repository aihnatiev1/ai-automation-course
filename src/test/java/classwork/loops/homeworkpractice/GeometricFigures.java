package classwork.loops.homeworkpractice;

public class GeometricFigures {
    public static void main(String[] args) {

        int star = 5;

        System.out.println();
        for (int i = 0; i <= star; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i <= star; i++) {
            for (int j = i; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i <= star; i++) {
            for (int j = star; j > i; j--) {
                System.out.print(" ");
            }

            for (int j1 = 0; j1 <= i; j1++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i <= star; i++) {
            for (int j = star; j > i; j--) {
                System.out.print(" ");
            }

            for (int j1 = 0; j1 <= i; j1++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = star -1; i >= 0; i--) {

            for (int j = star; j > i; j--) {
                System.out.print(" ");
            }

            for (int j1 = 0; j1 <= i; j1++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


