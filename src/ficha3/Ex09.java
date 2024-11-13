package ficha3;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o numero inteiro para calcular absoluto: ");
        int number = sc.nextInt();

        absoluteCalc(number);

        sc.close();
    }

    private static void absoluteCalc(int number) {
        System.out.println(number < 0 ? "|" + number + "| = " + -number : "|" + number + "| = " + number);
    }
}
