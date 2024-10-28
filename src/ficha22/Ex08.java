package ficha22;

import java.util.Random;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o menor número do intervalo: ");

        int min = sc.nextInt();

        System.out.println("Insira o maior número do intervalo: ");
        int max = sc.nextInt();

        if (min > max){
            System.out.println("Deve inserir o número menor em primeiro lugar!");
        } else {
            System.out.println(generateRandomNumber(min, max));
        }
    }
    private static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
