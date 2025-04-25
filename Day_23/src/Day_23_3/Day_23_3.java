package Day_23_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Clock;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day_23_3 {
    public static void main(String[] args) throws IOException {
        String s = choose();
        int a = chooseInt();
        FileWriter fw = new FileWriter("E:\\彩票.txt");
        Random random = new Random();
        StringBuilder str1 = new StringBuilder(String.valueOf(random.nextInt(1, 10)));
        for (int i = 1; i < 10; i++) {
            str1.append(random.nextInt(0, 10));
        }
        StringBuilder str2 = new StringBuilder();
        if (s.equals("3D")){
            for (int k = 0; k < a; k++) {
                for (int j = 0;j < 3;j++){
                    str2.append(random.nextInt(0, 10));
                }
                str2.append(",");
            }
        }
        else if (s.equals("5D")){
            for (int k = 0;k < a;k++){
                str2.append(",");
                for (int j = 0;j < 5;j++){
                    str2.append(random.nextInt(0, 10));
                }
            }
        }
        fw.write(LocalTime.now()+"  "+ str1+"  "+str2);
        fw.close();
    }

    public static String choose(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您想要下注的彩票类型：");
        return sc.nextLine();
    }
    public static int chooseInt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想下的注数");
            int s = sc.nextInt();
            return s;

    }
}
