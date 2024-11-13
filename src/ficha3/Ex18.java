package ficha3;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduza o valor do vencimento: ");
        double salary = sc.nextDouble();

        System.out.printf("O seu salário com o novo aumento passa a ser de %.2f€: ", calcIncreasedValue(salary));

        sc.close();
    }

    private static double calcIncreasedValue(double salary) {
        if(salary < 800) {
            return salary * 1.15;
        } else if(salary >= 800 && salary < 1000) {
            return salary * 1.10;
        } else {
            return salary * 1.05;
        }
    }
}
