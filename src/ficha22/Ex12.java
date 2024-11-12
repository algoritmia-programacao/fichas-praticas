package ficha22;

public class Ex12 {
    public static void main(String[] args) {
        double x1 = Math.toRadians(48.87);
        double y1 = Math.toRadians(-2.33);
        double x2 = Math.toRadians(37.8);
        double y2 = Math.toRadians(122.4);

        System.out.printf("A distância circular entre Paris e São Francisco é de %.2fkm", calcCircularDistance(x1, y1, x2, y2));
    }

    private static double calcCircularDistance(double x1, double y1, double x2, double y2) {
        return 60*Math.toDegrees(Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1 - y2)));
    }
}
