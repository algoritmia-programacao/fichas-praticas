package ficha22;

import java.util.Random;

public class Ex06 {
    public static void main(String[] args) {
        Random random = new Random();
        int dieNumber = random.nextInt(6) + 1;
        System.out.println(dieNumber);
    }
}
