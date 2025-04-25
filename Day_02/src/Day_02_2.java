import java.util.Scanner;

public class Day_02_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int b = (int)(a*100);
        double c = (double)b/100;
        System.out.println(c);
    }
}
