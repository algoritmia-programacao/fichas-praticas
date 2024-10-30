package ficha22;

import java.text.DecimalFormat;

public class Ex17 {
    public static void main(String[] args) {
        int bananas = 8;
        int strawberries = 27;
        int mangos = 6;

        double bananaWeight = 1.2345;
        double strawberriesWeight = 0.87;
        double mangosWeight = 2.167;

        /*System.out.println("Fruta\t\t|Quantidade|\t\tPeso|\n" +
                "_____________________________________\n" +
                "bananas\t\t|\t\t  " + bananas + "|\t  " + df.format(bananaWeight) + "|\n" +
                "strawberies\t|\t\t " + strawberries + "|\t\t" + strawberriesWeight + "|\n" +
                "mangos\t\t|\t\t  " + mangos + "|\t   " + df.format(mangosWeight) + "|\n");*/

        System.out.printf("%-12s|%-10s|%10s|%n", "Fruta", "Quantidade", "Peso");
        System.out.println("___________________________________");
        System.out.printf("%-12s|%-10s|%10.2f|%n", "Bananas", bananas, bananaWeight);
        System.out.printf("%-12s|%-10s|%10.2f|%n", "Strawberries", strawberries, strawberriesWeight);
        System.out.printf("%-12s|%-10s|%10.2f|%n", "Mangos", mangos, mangosWeight);
    }
}
