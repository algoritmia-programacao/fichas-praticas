package ficha3;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduza um caracter:");
        char character = sc.next().charAt(0);

        verifyCase(character);

        sc.close();
    }

    private static void verifyCase(char character) {

        boolean lowerCase = character >= 'a' && character <= 'z';
        boolean camelCase = character >= 'A' && character <= 'Z';

        int dif = 'a' - 'A';

        if (lowerCase || camelCase) {
            System.out.println(character + " é uma letra.");

            if (lowerCase) {
                char convertedCaseChar = (char) (character - dif);
                System.out.println("A maiúscula de " + character + " é " + convertedCaseChar);
            } else {
                char convertedCaseChar = (char) (character + dif);
                System.out.println("A minúscula de " + character + " é " + convertedCaseChar);
            }
        } else
            System.out.println(character + " não é uma letra.");
    }
}
