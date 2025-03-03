package classwork.loops.homeworkpractice;

public class GeometricFigures {
    public static void main(String[] args) {

        int star = 5;

//        for (int i = 0; i <= star; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i <= star; i++) {
//            for (int j = i; j <= star; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for (int i = 0; i <= star; i++) {
            for (int j = star; j > i; j--) {
                System.out.println(" ");
            }
            for (int j1 = 0; j1 <= i; j1++) {
                System.out.println("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = star; j > i; j--) {
                System.out.print(" ");
            }
        }

//        int rectangle = 5;

//        for (int i = 0; i <= rectangle; i++) {
//
//            //Левое пустое пространство
////            for (int j = rectangle; j > i; j--) {
////                System.out.print(" ");
////            }
//
//            //Левая часть треугольника
//            for (int j1 = 0; j1 <= i; j1++) { //Здесь можно изменить счётчик или поставить равенство с внешним счётчиком что бы пирамидка была остроугольная
//                System.out.print("+");
//            }
//
//            //Правая часть треугольника
//            for (int j = 0; j < i; j++) {
//                System.out.print("+");
//            }
//
//            //Правое пустое пространство
//            for (int j = rectangle; j > i; j--) {
//                System.out.print(" ");
//            }
//
//            System.out.println("*" + i);
//        }
    }
}
