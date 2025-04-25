package Day_28_1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Day_28_1 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1234);
        System.out.println("服务器启动，等待连接...");
        Socket client = ss.accept();
        System.out.println("客户端已连接");
        InputStream in = client.getInputStream();
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);
        OutputStream out = client.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));
        int a = new Random().nextInt(100) ;
        bw.write("游戏开始，请输入你的猜测：");
        bw.newLine();
        bw.flush();
        while (true) {
            String input = br.readLine();
            int c = Integer.parseInt(input);
            if (c == a) {
                System.out.println("猜对了");
                bw.write("猜对了");
                bw.flush();
                break;
            } else if (c < a) {
                System.out.println("猜小了");
                bw.write("猜小了");
                bw.flush();
            } else {
                System.out.println("猜大了");
                bw.write("猜大了");
                bw.flush();
            }
            bw.write("请输入你的猜测：");
            bw.newLine();
            bw.flush();
        }
        bw.close();
        isr.close();
        br.close();
        client.close();
    }
}