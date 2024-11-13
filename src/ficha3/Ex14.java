package ficha3;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduza o segundo número: ");
        int num2 = sc.nextInt();
        System.out.print("Introduza o terceiro número: ");
        int num3 = sc.nextInt();

        System.out.println("O valor maior é: " + verifyBigger(num1, num2, num3));

        sc.close();
    }

    private static int verifyBigger(int num1, int num2, int num3) {
        if (num1 > num2) {
            return num1;
        } else if (num3 > num2) {
            return num3;
        } else {
            return num2;
        }
    }
}
