package ficha3;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza a altura em metros: ");
        double height = sc.nextDouble();
        System.out.print("Introduza o peso em kg: ");
        double weight = sc.nextDouble();

        calculateBMI(height, weight);

        sc.close();
    }

    private static void calculateBMI(double height, double weight) {
        double bmi = weight / (height * height);
        if (bmi < 18.5)
            System.out.println("Peso abaixo do recomendado");
        else if (bmi < 25)
            System.out.println("Peso normal");
        else if (bmi < 30)
            System.out.println("Peso acima do recomendado");
        else
            System.out.println("Obesidade");
    }
}
