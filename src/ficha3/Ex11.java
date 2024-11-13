package ficha3;

import java.util.Random;

public class Ex11 {
    public static void main(String[] args) {
        Random rand = new Random();

        int flip = rand.nextInt(2);

        flipCoin(flip);
    }

    private static void flipCoin(int flip) {
        System.out.println(flip == 0 ? "Cara" : "Coroa");
    }
}
