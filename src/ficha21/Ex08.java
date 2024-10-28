package ficha21;

public class Ex08 {
    public static void main(String[] args) {
        double test1 = 9.8, test2 = 14.5, test3 = 11.5;

        System.out.println("Nota final: " + Math.floor(media(test1, test2, test3)));
    }
    private static double media(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
