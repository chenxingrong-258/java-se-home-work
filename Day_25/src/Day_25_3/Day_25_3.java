package Day_25_3;

import java.io.*;

public class Day_25_3 {
    public static void main(String[] args) {
        task(new File("E:\\java基础_史老师\\day25_多线程\\hello.txt"),new File("E:\\java基础_史老师\\day25_多线程\\hello1.txt")).start();
        task(new File("E:\\java基础_史老师\\day25_多线程\\OIP-C.jfif"),new File("E:\\java基础_史老师\\day25_多线程\\OIP-C1.jfif")).start();
        
    }
    public static Thread task(File source, File dest) {
         Thread thread = new Thread(new Runnable() {

             @Override
             public void run() {
                 try {
                     copyFile(source,dest);
                 } catch (IOException e) {
                     throw new RuntimeException(e);
                 }
             }
         });
         return thread;
    }
    public static void copyFile(File source, File dest) throws IOException {
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest));
        byte[] buf = new byte[1024];
        int len;
        int sum = 0;
        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
            sum+=len;
            if ((long) (sum* 100L /source.length()) == sum*100L/source.length()) {
                System.out.println(source.getName()+"进度已完成"+sum*100l/source.length()+"%");
            }
        }
        in.close();
        out.close();
    }
}
