package Day_14_1;

import java.util.Scanner;

public class Day_14_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证号码: ");
        String s = sc.nextLine();
        String s1 = "\\d{17}[\\dX]";
        if (s.length()!=18){
            System.out.println("身份证密码位数不对");
        }else if (!s.matches(s1)){
            System.out.println("身份证号码格式错误");
        } else if (s.length()==18&&s.matches(s1)) {
            StringBuffer sb = new StringBuffer(s);
            sb.replace(6,14,"XXXXXXXX");
            System.out.println(sb.toString());
            char c = sb.charAt(16);
            if ((int)c%2 == 0){
                System.out.println("先生");
            }else {
                System.out.println("女士");
            }
        }
    }
}
