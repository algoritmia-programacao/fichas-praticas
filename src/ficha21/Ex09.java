package ficha21;

import java.sql.Time;

public class Ex09 {
    public static void main(String[] args) {
        Time time = Time.valueOf("09:00:32");
        System.out.println(time.getSeconds());
    }
}
