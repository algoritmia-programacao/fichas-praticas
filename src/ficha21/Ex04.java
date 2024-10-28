package ficha21;

public class Ex04 {
    public static void main(String[] args) {
        double weight = 80.5, height = 180;

        System.out.println("O IMC é: " + imcCalculator(weight, height));
    }

    private static double imcCalculator(double weight, double height) {
        return weight / (height * height);
    }
}
