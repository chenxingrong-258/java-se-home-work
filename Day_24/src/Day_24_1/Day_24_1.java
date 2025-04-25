package Day_24_1;

import java.io.*;
import java.util.Scanner;

public class Day_24_1 {
    public static void main(String[] args) throws IOException {
        enroll();
    }
    public static void enroll() throws IOException {
        File file = new File("E:\\Test\\users");
        boolean mkdir = file.mkdir();
        System.out.println("请输入用户名：");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        File [] files = file.listFiles();
        boolean flag = false;
        for (File file1 : files) {
            if (s.equals(file1.getName())) {
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("请输入密码");
            String pw = sc.nextLine();
            User user = new User(s,pw);
            File newfile = new File("E:\\Test\\users\\" ,user.getUser_name());
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(newfile));
            oos.writeObject(user);
            oos.close();
        }else {
            System.out.println("注册失败");
        }



    }
}
