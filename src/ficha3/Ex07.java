package ficha3;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduza o ano: ");
        int year = sc.nextInt();

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.printf("O ano %d é bisexto!", year);
        } else {
            System.out.printf("O ano %d não é bisexto!",year);
        }

        sc.close();
    }
}
