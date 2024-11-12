package ficha22;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor do ângulo: ");
        double angle = Math.toRadians(sc.nextInt());

        System.out.printf("O resultado da relação trignométrica de %.2f é %.1f: ", angle, trigonometricRelations(angle));

        sc.close();
    }

    private static double trigonometricRelations(double angle){
        return Math.pow(Math.sin(angle), 2) + Math.pow(Math.cos(angle), 2);
    }
}
