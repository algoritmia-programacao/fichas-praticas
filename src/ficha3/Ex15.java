package ficha3;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduza o segundo número: ");
        int num2 = sc.nextInt();
        System.out.print("Introduza o terceiro número: ");
        int num3 = sc.nextInt();

        sortNumbers(num1, num2, num3);

        sc.close();
    }

    private static void sortNumbers(int num1, int num2, int num3) {
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 > num3) {
            int temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }

        System.out.println("Números por ordem crescente: " + num1 + ", " + num2 + ", " + num3);
    }
}
