package ficha3;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o numero inteiro para calcular absoluto: ");
        int number = sc.nextInt();

        System.out.printf("|%1d| = %1d", number, absoluteCalc(number));

        sc.close();
    }

    private static int absoluteCalc(int number) {
        if(number<0) {
            return -number;
        } else {
            return number;
        }
    }
}
