package Day_28_1;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Day_28_1_1 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);
        System.out.println("已连接上服务器");
        OutputStream os = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        Scanner sc = new Scanner(System.in);
        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(inputStreamReader);
        String serverMessage;
        while (true){
            serverMessage = br.readLine();
            System.out.println(serverMessage);
            if (!serverMessage.equals("猜对了")){
                int b = sc.nextInt();
                bw.write(String.valueOf(b));
                bw.newLine();
                bw.flush();
            }else {
                System.out.println("游戏结束");
                break;
            }
        }
        bw.close();
        sc.close();
        socket.close();
    }
}