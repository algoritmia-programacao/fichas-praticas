package ficha22;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduza o preço do produto: ");
        double price = sc.nextDouble();
        System.out.println("Introduza o desconto a ser aplicado: ");
        int discount = sc.nextInt();

        double finalPrice = price * ((double) discount / 100);
        double discountValue = finalPrice - price;

        if (discount >= 0 && discount <= 100) {
            System.out.printf("%-14s%8.2f\n%-14s %5d%%\n%-14s%8.2f\n%-14s%8.2f\n", "Preço: ", price, "%Desconto: ", discount, "Preço final: ", finalPrice, "Desconto: ", discountValue);
        } else {
            System.out.println("O desconto deve ser um valor entre 0 e 100");
        }

    }
}
