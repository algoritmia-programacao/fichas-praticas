package ficha3;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza a cilindrada do veículo: ");
        int engine = sc.nextInt();

        System.out.printf("Para uma cilindrada de %d o IA é %.2f%n", engine, calcTax(engine));

        sc.close();
    }

    private static double calcTax(int engine) {
        double tax = 0, parcel = 0;
        if (engine < 1250) {
            tax = 3.74;
            parcel = 2417.56;
            return calcFinalTax(engine, tax, parcel);
        } else {
            tax = 8.86;
            parcel = 8813.22;
            return calcFinalTax(engine, tax, parcel);
        }
    }

    private static double calcFinalTax(int engine, double tax, double parcel) {
        return engine * tax - parcel < 0 ? 0 : engine * tax - parcel;
    }
}
