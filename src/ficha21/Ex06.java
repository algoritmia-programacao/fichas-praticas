package ficha21;

public class Ex06 {
    public static void main(String[] args) {
        double radius = 15;
        System.out.println("A area do circulo com raio de " + radius + " metros é de " + Math.floor(circleArea(radius)) + "m");
    }

    private static double circleArea(double radius) {
        return Math.PI * (radius * radius);
    }
}
