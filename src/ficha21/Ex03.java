package ficha21;

public class Ex03 {
    public static void main(String[] args) {
        int value1 = 5, value2 = 3;

        System.out.println(multiplication(value1, value2) + "\n" +
                divisionAndRest(value1, value2) + "\n" +
                square(value1, value2));
    }

    private static String multiplication(int value1, int value2) {
        return value1 + " * " +value2 + " = " + value1 * value2;
    }

    private static String divisionAndRest(int value1, int value2) {
        return value1 + " / " + value2 + " = " + value1/value2 + " % " + value1 % value2;
    }

    private static String square(int value1, int value2) {
        int squareValue1 = value1*value1;
        int squareValue2 = value2*value2;
        return value1 + " ^ 2 = " + squareValue1 +
                "\n" + value2 + " ^ 2 = " + squareValue2;
    }
}
