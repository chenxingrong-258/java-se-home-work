import java.util.Scanner;

public class Day_07_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int n = sc.nextInt();
        abs(n);
    }
    public static int abs(int a) {
        if (a>=0){
            return a;
        }else {
            return -a;
        }
    }
}
