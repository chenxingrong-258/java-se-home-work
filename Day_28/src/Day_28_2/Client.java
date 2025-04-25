package Day_28_2;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",1234);
        Scanner sc = new Scanner(System.in);
        String s;
        File file;
        while (true) {
            System.out.println("请输入文件名");
            s = sc.nextLine();
            file = new File(s);
            if (!file.exists()) {
                System.out.println("文件不存在");
            }else {
                System.out.println("文件输入成功");
                break;
            }
        }
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        pw.println(file.getName());
        pw.flush();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        if (br.readLine().equals("y")){
            System.out.println("同意接收文件");
            FileReader fr = new FileReader(file);
            FileWriter fw = new FileWriter(new File(br.readLine()));
            int c;
            char[]chars = new char[1024];
            if ((c = fr.read(chars))!=-1){
                fw.write(chars,0,c);
            }
            fr.close();
            fw.close();
            System.out.println("文件上传成功");
        }else if (br.readLine().equals("n")){
            System.out.println("拒绝接收文件");
        }
        pw.close();
        br.close();
        socket.close();
    }
}
