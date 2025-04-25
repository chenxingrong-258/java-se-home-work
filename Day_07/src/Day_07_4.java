import java.util.Scanner;

public class Day_07_4 {
    public static void main(String[] args) {
        System.out.println("请输入数字:");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int[] x = new int[]{12,23,31,56,43,67};
        boolean result = findnumber(x,y);
        System.out.println(result);
    }
    public static boolean findnumber(int x[], int y){
        boolean flag = false;
        for (int j : x) {
            if (j == y) {
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        return flag;
    }
}
