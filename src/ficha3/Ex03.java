package ficha3;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza o dividendo: ");
        int num1 = sc.nextInt();
        System.out.println("Introduza o divisor: ");
        int num2 = sc.nextInt();

        divide(num1, num2);

        sc.close();
    }

    private static void divide(int num1, int num2) {
        if(num1 == 0 || num2 == 0){
            System.out.println("Não pode dividir por 0");
        } else {
            System.out.printf("%d / %d = %d", num1, num2, num1/num2);
        }
    }
}
