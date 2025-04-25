import java.util.Scanner;

public class Day_07_5 {
    public static void main(String[] args) {
        System.out.println("请输入正确的国家名:");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] countries = new String[]{"中国","美国","俄罗斯","法国","英国"};
        boolean result = judgement(s, countries);
        System.out.println(result);
    }
    public static boolean judgement(String s,String[] countries){
        boolean flag = false;
        for (String  a:countries){
            if (a .equals(s)){
                flag = true;
                break;
            }else {
                flag = false;
            }
        }
        return flag;
    }

}
