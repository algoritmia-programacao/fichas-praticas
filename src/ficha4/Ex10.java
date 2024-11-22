package ficha4;

public class Ex10 {
    public static void main(String[] args) {
        printAsciiTable();
    }

    public static void printAsciiTable() {
        for (int n = 0; n <= 256; n++){
            System.out.println("Character " + (char)n + " is ASCII code: " + n);
        }
    }
}
