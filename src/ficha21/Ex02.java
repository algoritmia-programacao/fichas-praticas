package ficha21;

public class Ex02 {
    public static void main(String[] args) {
        int value1 = 3, value2 = 5, value3 = 4;

        int sum = sum(value1, value2, value3);

        System.out.println(value1 + "+" + value2 + "+" + value3 + "=" + sum);
    }

    private static int sum(int value1, int value2, int value3) {
        return value1 + value2 + value3;
    }
}
