import java.util.Scanner;

public class Day_13_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名: ");
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        for(char c : ch){
            if ((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
                continue;
            }else{
                System.out.println("账号必须都为英文字母");
                break;
            }
        }
        boolean a = false;
        boolean b = false;
        boolean c = false;
        System.out.println("请输入密码:");
        String s1 = sc.nextLine();
        char[] ch1 = s1.toCharArray();
        for(char c1 : ch1){
            if (Character.isDigit(c1)){
                a = true;
            } else if (Character.isLowerCase(c1)) {
                b = true;
            } else  if (Character.isUpperCase(c1)) {
                c = true;
            }
        }System.out.println(a&b&c? "有效密码":"无效密码");


    }
}
