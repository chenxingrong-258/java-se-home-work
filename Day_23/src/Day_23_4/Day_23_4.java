package Day_23_4;

import java.io.*;
import java.util.Arrays;

public class Day_23_4 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("E:\\签到表.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("张三,");
        bw.write("李四,");
        bw.write("王五,");
        bw.write("完成");
        bw.close();
        fw.close();
        FileWriter fw1 = new FileWriter("E:\\2024.10.7签到表.txt");
        BufferedWriter bw1 = new BufferedWriter(fw1);
        bw1.write("张三,");
        bw1.write("李四,");
        bw1.write("完成");
        fw.close();
        bw1.close();
        FileReader fileReader = new FileReader("E:\\签到表.txt");
        BufferedReader br = new BufferedReader(fileReader);
        FileReader fileReader1 = new FileReader("E:\\2024.10.7签到表.txt");
        BufferedReader br1 = new BufferedReader(fileReader1);
        FileWriter fw2 = new FileWriter("E:\\2024.10.7缺勤表.txt");
        String [] str1 = br.readLine().split(",");
        String [] str2 = br1.readLine().split(",");
        int a = 0;
        for (String s1 : str1) {
            boolean flag = false;
            for (String s2 : str2) {
                if (s1.equals(s2)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                a = a+1;
                fw2.write(s1 + ",");
                break;
            }
        }
        System.out.println(a);
        fw2.close();
        fileReader1.close();
        fileReader.close();
        br1.close();
        br.close();
    }
}
