package ficha22;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza o primeiro parâmetro: ");
        boolean param1 = sc.nextBoolean();
        System.out.print("Introduza o segundo parâmetro: ");
        boolean param2 = sc.nextBoolean();
        System.out.print("Introduza o terceiro parâmetro: ");
        boolean param3 = sc.nextBoolean();

        boolean result = parityCalculation(param1, param2, param3);

        System.out.println("A paridade é: " + result);

        sc.close();
    }

    private static boolean parityCalculation(boolean param1, boolean param2, boolean param3){
        return param1 && !param2 && !param3 || !param1 && param2 && !param3 || !param1 && !param2 && param3 || param1 && param2 && param3;
    }
}
