package ficha4;

public class Ex09 {
    public static void main(String[] args) {
        int trys = counter();

        System.out.printf("Tentativas: %d", trys);
    }

    private static int counter(){
        int dice1, dice2;
        int count = 0;

        do{
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
            count++;
        } while(dice1 != 6 && dice2 != 6);
        return count;
    }
}
