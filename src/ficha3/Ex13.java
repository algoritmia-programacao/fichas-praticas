package ficha3;

public class Ex13 {
    public static void main(String[] args) {
        System.out.println("Saíu " + biasedDice() + " no lançamento do dado!");
    }

    private static int biasedDice() {
        int diceNumber = 0;

        if (Math.random() < 3 / 8.0)
            return 6;
        else
            return 1 + (int) (5 * Math.random());
    }
}
