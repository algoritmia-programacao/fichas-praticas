package ficha22;

public class Ex07 {
    public static void main(String[] args) {
        double number1 = 4.54;
        double number2 = 3.37;

        System.out.printf("A soma das partes decimais é %.2f", decimalSum(number1, number2));
    }

    private static double decimalSum(double number1, double number2) {
        return (number1 - (long) number1) + (number2 - (long) number2);
    }
}
