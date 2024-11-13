package ficha3;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduza do valor do salário: ");
        double salary = sc.nextDouble();

        calculateSalaryTax(salary);

        sc.close();
    }

    private static void calculateSalaryTax(double salary) {
        double tax = 1;
        String description = "Salário Bruto: %.2f€\nTaxa de IRS: %.2f%%\nSalário Líquido: %.2f€";
        if (salary < 500) {
            System.out.printf(description, salary, (tax-1)*100, salary/tax);
        } else if (salary < 650) {
            tax = 1.015;
            System.out.printf(description, salary, (tax-1)*100, salary/tax);
        } else if (salary < 800) {
            tax = 1.035;
            System.out.printf(description, salary, (tax-1)*100, salary/tax);
        } else if (salary < 1200) {
            tax = 1.05;
            System.out.printf(description, salary, (tax-1)*100, salary/tax);
        } else if (salary < 2000) {
            tax = 1.10;
            System.out.printf(description, salary, (tax-1)*100, salary/tax);
        } else if (salary < 3000) {
            tax = 1.20;
            System.out.printf(description, salary, (tax-1)*100, salary/tax);
        } else {
            tax = 1.30;
            System.out.printf(description, salary, (tax-1)*100, salary/tax);
        }
    }
}
