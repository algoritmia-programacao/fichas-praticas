package ficha22;

public class Ex17 {
    public static void main(String[] args) {
        int bananas = 8;
        int strawberries = 27;
        int mangos = 6;

        double bananaWeight = 1.2345;
        double strawberriesWeight = 0.87;
        double mangosWeight = 2.167;

        System.out.printf("%-12s|%-10s|%10s|%n", "Fruta", "Quantidade", "Peso");
        System.out.println("___________________________________");
        System.out.printf("%-12s|%-10s|%10.2f|%n", "Bananas", bananas, bananaWeight);
        System.out.printf("%-12s|%-10s|%10.2f|%n", "Strawberries", strawberries, strawberriesWeight);
        System.out.printf("%-12s|%-10s|%10.2f|%n", "Mangos", mangos, mangosWeight);
    }
}
