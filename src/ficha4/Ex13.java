package ficha4;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        int sum = sumIfPositive();
        System.out.printf("A soma de todos os numeros é: %d%n",sum);
    }

    private static int sumIfPositive() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while (num != 0) {
            if (num > 0){
                sum += num;
            }
            System.out.println("Introduza o numero: ");
            num = sc.nextInt();
        }
        sc.close();
        return sum;
    }
}
