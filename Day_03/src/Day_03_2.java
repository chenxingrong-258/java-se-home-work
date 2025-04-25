import java.util.Scanner;

public class Day_03_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入任意一个非零的1位整数: ");
        int x = sc.nextInt();
        int y = 9*x;
        int z = (y>=10?y/10+y%10:y);
        z = z*27+7;
        System.out.println(z);
    }
}
