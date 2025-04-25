package Day_14_3;

import java.util.Scanner;

public class Day_14_3 {
    public static void main(String[] args) {
        System.out.println("请输入邮箱地址：");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(";");
        int count = 0;
        int count1 = 0;
        for (String s2 : s1) {
            int at = s2.indexOf("@");
            int at1 = s2.lastIndexOf("@");
            int point = s2.lastIndexOf(".");
            int a = s2.indexOf("q");
            int b = s2.lastIndexOf("q");
            if (at!=-1&&at == at1&&point!=-1&&point>at+1&&point!=s.length()-1&&a==b-1) {
                count++;
                count1++;
            } else if (at!=-1&&at == at1&&point!=-1&&point>at+1&&point!=s.length()-1) {
                count++;
            } else {
                System.out.println("邮箱格式错误，发送失败");
            }
        }
        System.out.println("成功发送了"+count+"个邮箱");
        System.out.println("其中有"+count1+"个qq邮箱");


    }
}
