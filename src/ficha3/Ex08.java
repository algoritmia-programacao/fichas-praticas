package ficha3;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduza um numero entre 50 e 100: ");
        double number = sc.nextDouble();

        if(number >= 50 && number <= 100) {
            System.out.printf("Introduziu o número %.2f que está entre 50 e 100!", number);
        } else if (number < 50){
            System.out.printf("O número %.2f é inferior a 50, logo é substituido por 50\nO seu número é 50!", number);
        } else {
            System.out.printf("O número %.2f é superior a 100, logo é substituido por 100\nO seu número é 100!", number);
        }

        sc.close();
    }
}
