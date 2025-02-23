package homework.homework2;

public class Primitives {

    int num = 5;
    double num2 = 7.8;
    double assignDoubleToInt = num;
    int castDoubleToInt = (int) num2;
}

class Assign {
    public static void main(String[] args) {
        Primitives obj = new Primitives();
        System.out.println(obj.assignDoubleToInt);
        System.out.println(obj.castDoubleToInt);
    }
}
