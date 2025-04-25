package Day_15_2;

import java.util.Scanner;

public class Day_15_2 {
    public static void main(String[] args) {
        System.out.println("请输入你的操作系统");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System_enum []values = System_enum.values();
        if (values[0].name().equals(s)) {
            System.out.println("推荐使用IE浏览器");
        } else if (values[1].name().equals(s)) {
            System.out.println("推荐使用Chrome浏览器");
        } else {
            System.out.println("请输入正确的操作系统");

        }
    }
}
