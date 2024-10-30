package ficha22;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor dos segundos: ");
        int totalSeconds = sc.nextInt();

        System.out.println("Segundos convertidos: " + convertSecondsToHours(totalSeconds));
    }

    private static String convertSecondsToHours(int totalSeconds) {
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600)/60;
        int seconds = totalSeconds % 60;
        return hours + ":" + minutes + ":" + seconds;
    }
}
