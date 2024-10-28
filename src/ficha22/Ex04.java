package ficha22;

import java.util.Random;

public class Ex04 {
    public static void main(String[] args) {
        char lowerCaseLetter = 'f';

        System.out.println(randomLetterBefore(lowerCaseLetter));
    }
    private static char randomLetterBefore(char lowerCaseLetter) {
        Random random = new Random();
        return (char) (random.nextInt(lowerCaseLetter - 'a') + 'a');
    }
}
