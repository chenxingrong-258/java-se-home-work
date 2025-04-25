import java.util.Scanner;

public class Day_05_01 {
    public static void main(String[] args) {
        System.out.println("请输入一个数字");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i =2;i<a;i++){
            if (a%i!=0&&i==a-1){
                System.out.println("该数字是素数");
            }else if (a%i==0){
                System.out.println("该数字不是素数");
                break;
            }else {
                continue;
            }
        }
    }
}
