package ficha21;

import java.text.DecimalFormat;

public class Ex10 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");

        int visitDays = 4;
        double valueSpentFirstDay = 10.50;

        System.out.println("Total gasto na visita a Castelo Branco: " + df.format(totalSpent(valueSpentFirstDay, visitDays)) + "€");
    }
    private static double totalSpent(double valueSpentFirstDay, int visitDays) {
        double valueSpentSecondDay = valueSpentFirstDay * 1.10;
        double valueSpentThirdDay = valueSpentSecondDay * 1.10;
        double valueSpentFourthDay = valueSpentThirdDay * 1.10;
        return valueSpentFirstDay + valueSpentSecondDay + valueSpentThirdDay + valueSpentFourthDay;
    }
}
