package ficha3;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduza o número: ");
        int number = sc.nextInt();

        verifyOdd(number);

        sc.close();
    }

    private static void verifyOdd(int number) {
        System.out.println(number % 2 == 0 ? "O " + number + " é par!" : "O " + number + " é ímpar!");
    }
}
