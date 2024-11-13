package ficha3;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduza o número: ");
        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.printf("O %d é par!", number);
        } else {
            System.out.printf("O %d é impar!", number);
        }

        sc.close();
    }
}
