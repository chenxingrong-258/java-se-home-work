package Day_16_1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Day_16_1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate bornday = LocalDate.of(2003, 10, 19);
        long days = ChronoUnit.DAYS.between(bornday,today);
        System.out.println(days);
    }
}
