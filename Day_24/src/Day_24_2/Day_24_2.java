package Day_24_2;
import Day_24_1.User;
import Day_24_2.*;

import java.io.*;
import java.util.Scanner;

public class Day_24_2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        register();
    }
    public static User register() throws IOException, ClassNotFoundException {
        File file = new File("E:\\Test\\users");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String s = sc.nextLine();
        File[] files = file.listFiles();
        boolean flag = false;
        if (files != null) {
            for (File file1 : files) {
                if (file1.getName().equals(s)) {
                    flag = true;
                    System.out.println("请输入密码:");
                    String s1 = sc.nextLine();
                    ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file1));
                    User user = (User) ois.readObject();
                    if (user.getPassword().equals(s1)) {
                        System.out.println("登入成功");
                        ois.close();
                        return user;
                    }else {
                        System.out.println("请输入正确的密码");
                        ois.close();
                        }
                    }
                }
            }
        if(!flag) {
            System.out.println("请输入正确的用户名");
        }
        return null;
    }
}
