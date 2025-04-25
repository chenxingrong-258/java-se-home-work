package Day_15_3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Day_15_3 {
    public static void main(String[] args) {
        System.out.println("请输入多个数字值组成的字符串，以逗号隔开");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String [] split = s.split(",");
        for (String s1 : split) {
            BigDecimal b = new BigDecimal(s1);
            BigDecimal b1 = b.divide(BigDecimal.valueOf(0.1),2,RoundingMode.HALF_UP);
            System.out.print(b1+",");
        }

    }
}
