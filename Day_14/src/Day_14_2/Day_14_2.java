package Day_14_2;

import java.util.Scanner;

public class Day_14_2 {
    public static void main(String[] args) {
        char [] words = new char[]{'1','2','三'};
        System.out.println("用户请输入聊天内容");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 ="";
        char [] user_words = s.toCharArray();
        boolean flag = false;
        for (char user_word : user_words) {
            for (char word : words) {
                if (user_word == word) {
                    flag = false;
                    break;
                }else {
                    flag = true;
                }
            }
            if (flag) {
                s1 += user_word;
            }else {
                s1 +="*";
            }
        }
        System.out.println(s1);


    }
}
