package ficha21;

import java.text.DecimalFormat;

public class Ex07 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        double price = 24.99;

        System.out.println("Sub-Total: " + price + "€\n" +
                "Desconto: 20%\n" +
                "Total: " + df.format(discountCalculator(price)) + "€");
    }

    private static double discountCalculator(double price) {
        return price / 1.20;
    }
}
