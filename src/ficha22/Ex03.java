package ficha22;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o codigo UTF: ");
        int utfCode = sc.nextInt();

        System.out.println("O seu caracter é: " + codeToChar(utfCode));
    }

    private static char codeToChar(int utfCode) {
        return (char) utfCode;
    }
}
