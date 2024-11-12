package ficha22;

import java.util.Scanner;

public class Ex13 {
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

        System.out.printf("Y = %.2fx + %.2f%n", calculateM(x1, y1, x2, y2), calculateB(x1, y1, x2, y2));

        sc.close();
    }

    private static double calculateM(int x1, int y1, int x2, int y2){
        return ((double) (y2 - y1)) / (x2 - x1);
    }

    private static double calculateB(int x1, int y1, int x2, int y2){
        return y1 - x1*((double) y2 - y1)/(x2 - x1);
    }
}
