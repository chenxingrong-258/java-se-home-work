import java.util.Scanner;

public class Day_02_1 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = a/100;
            int c = (a%100)/10;
            int d = (a%10)%10;
            System.out.print(d);
            System.out.print(c);
            System.out.print(b);
        }
}
