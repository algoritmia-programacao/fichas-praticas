package ficha3;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduza o número: ");
        int number = sc.nextInt();

        if(number < 0){
            System.out.println("ERRO: O número tem que ser positivo");
        } else {
            System.out.printf("A raiz quadrada de %.2f é: ", Math.sqrt(number));
        }

        sc.close();
    }
}
