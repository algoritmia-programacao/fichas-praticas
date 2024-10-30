package ficha3;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro numero: ");
        int a = sc.nextInt();
        System.out.println("Insira o segundo numero: ");
        int b = sc.nextInt();

        System.out.println(lowerFirst(a, b));
    }

    private static String lowerFirst(int a, int b) {
        if (a > b) {
            int temp = b;
            b = a;
            a = temp;
            return a + " " + b;
        } else {
            return b + " " + a;
        }
    }
}