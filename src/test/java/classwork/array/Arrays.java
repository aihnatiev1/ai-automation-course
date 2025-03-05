package classwork.array;

public class Arrays {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 3, 'd', 'e', 'f'};
        System.out.println(chars);
        for (char aChar : chars) {
            System.out.print(aChar + " ");
        }

        System.out.println();

        int[] integers = {1, 2, 3, 4, '1', 6, 7, 8, 9, 10};
        System.out.println(java.util.Arrays.toString(integers));
        for (int integer : integers) {
            System.out.print(integer + " ");
        }
    }
}
