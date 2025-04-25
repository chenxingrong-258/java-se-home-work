import java.util.Arrays;
import java.util.Scanner;

public class Day_07_3 {
    public static void main(String[] args) {
        System.out.println("请选择彩票类型:3:3d;5:5d");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("请输入购买的注数：");
        int b = sc.nextInt();
        caipiao(a,b);
    }
    public static void caipiao(int a,int b){
        int x[][] = new int[a][b];
        for (int i = 0;i <= b-1;i++){
            for (int j = 0;j <= a-1;j++){
                x[i][j] = (int)(Math.random()*10);
            }
        }
        System.out.println(Arrays.deepToString(x));
    }
}
