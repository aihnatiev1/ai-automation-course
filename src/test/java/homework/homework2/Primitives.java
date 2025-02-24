package homework.homework2;

public class Primitives {

    int num = 5;
    double num2 = 7.8;
    double assignIntToDouble = num;
    int castDoubleToInt = (int) num2;
}

class Assign {
    public static void main(String[] args) {
        Primitives obj = new Primitives();
        System.out.println(obj.assignIntToDouble);
        System.out.println(obj.castDoubleToInt);
    }
}
