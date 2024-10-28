package ficha21;

import java.text.DecimalFormat;

public class Ex11 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        double baseSalary = 980;
        int carsSold = 3;
        double totalSales = 32342.56;
        System.out.println("Salário Líquido: " + df.format(finalSalary(baseSalary, carsSold, totalSales)) + "€");
    }

    private static double finalSalary(double baseSalary, int carsSold, double totalSales) {
        double bonus = carsSold * 0.1;
        double commission = totalSales * 0.01;
        return baseSalary + bonus + commission;
    }
}
