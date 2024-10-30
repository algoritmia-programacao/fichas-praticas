package ficha3;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o numero inteiro para calcular absoluto: ");
        int n = sc.nextInt();

        sc.close();

        System.out.printf("|%1d| = %1d", n, absoluteCalc(n));
    }

    private static int absoluteCalc(int n) {
        return Math.abs(n);
    }
}
