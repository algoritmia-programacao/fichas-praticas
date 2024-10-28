package ficha22;

public class Ex02 {
    public static void main(String[] args) {
        char upperCaseLetter = 'F';

        System.out.println("A minúscula de " + upperCaseLetter + " é " + toLowerCase(upperCaseLetter));
    }

    private static char toLowerCase(char upperCaseLetter) {
        return (char) (upperCaseLetter + 32);
    }
}
