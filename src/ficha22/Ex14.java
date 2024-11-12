package ficha22;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza as coordenadas\nx1: ");
        int x1 = sc.nextInt();
        System.out.print("y1: ");
        int y1 = sc.nextInt();
        System.out.print("x2: ");
        int x2 = sc.nextInt();
        System.out.print("y2: ");
        int y2 = sc.nextInt();

        System.out.printf("A distância entre os dois pontos é: %.4f", calculateDistance(x1, y1, x2, y2));

        sc.close();
    }

    private static double calculateDistance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

}
