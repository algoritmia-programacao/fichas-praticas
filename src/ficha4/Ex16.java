package ficha4;

public class Ex16 {
    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 100) + 1;
            if(num > max){
                max = num;
            }
        }
        System.out.printf("O máximo gerado foi: %d", max);
    }
}
