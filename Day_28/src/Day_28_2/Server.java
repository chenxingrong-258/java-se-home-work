package Day_28_2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        Scanner scanner = new Scanner(System.in);
        System.out.println("服务器启动中...");
        Socket socket = serverSocket.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str = br.readLine();
        PrintWriter pw = new PrintWriter(socket.getOutputStream());
        System.out.println("如果同意接收文件,请输入y,否则输入n");
        String str1 = scanner.next();
        pw.println(str1);
        pw.flush();
        if (str1.equals("y")) {
            System.out.println("请输入要用于接收的文件目录");
            String str2 = scanner.next();
            new File(str2).createNewFile();
            while (true){
                if (new File(str2).exists()){
                    pw.println(str2);
                    pw.flush();
                    System.out.println(str2);
                    break;
                }else {
                    boolean newFile = new File(str2).createNewFile();
                    if (!newFile){
                        System.out.println("创建失败,请重新创建");
                        str2 = scanner.next();
                    }else {
                        System.out.println("目录创建成功");
                    }
                }
            }
        } else if (str.equals("n")) {
            pw.close();
            br.close();
            socket.close();
            serverSocket.close();
        }
        pw.close();
        br.close();
        socket.close();
        serverSocket.close();
    }
}
