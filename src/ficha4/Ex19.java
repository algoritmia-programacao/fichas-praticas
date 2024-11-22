package ficha4;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        isPrimeNumber(num);
    }

    private static void isPrimeNumber(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println("O número é primo.");
            for (int j = 2; j < i; j++) {
                System.out.println("O número não é primo.");
            }
        }
    }
}
