import java.util.InputMismatchException;
import java.util.Scanner;

public class Day_12_01 {
    public static void main(String[] args) {
        try{System.out.println("请输入正确的摄氏温度");
            Scanner sc = new Scanner(System.in);
            double a = sc.nextDouble();
            double b = a*1.8 + 32;
            System.out.println("华氏温度为"+b);
        } catch (InputMismatchException e) {
            System.out.println("摄氏温度值应该为浮点数");
        }
    }
}
