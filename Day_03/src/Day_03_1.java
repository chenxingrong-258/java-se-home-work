import java.util.Scanner;

public class Day_03_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        int d = (a<b&&b<c||a<c&&c<b)?a:0;
//        d = (b<a&&a<c||b<c&&c<a)?b:0;
//        d = (c<a&&a<b||c<b&&b<a)?c:0;
//        System.out.println(d);
        int min = a;
        min = (min>=b?b:a);
        min = (min>=c?c:min);
        System.out.println(min);
    }
}
