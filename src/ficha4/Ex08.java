package ficha4;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduza o numero de asteriscos a criar: ");

        int n = sc.nextInt();

        System.out.println(generateAsteris(n));

        sc.close();
    }

    private static String generateAsteris(int n) {
        String a = "";
        for (int i = 0; i < n; i++) {
            a += "*" ;
        }
        return a;
    }
}
