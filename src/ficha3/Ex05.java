package ficha3;

import java.util.Random;

public class Ex05 {
    public static void main(String[] args) {
        Random rand = new Random();

        int flip = rand.nextInt(2);

        flipCoin(flip);
    }

    private static void flipCoin(int flip) {
        if(flip == 0) {
            System.out.println("Cara");
        } else {
            System.out.println("Coroa");
        }
    }
}
