package Day_27_5;

import java.io.*;
import java.time.LocalTime;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Day_27_5 {
    public static void main(String[] args) throws IOException {
        File file0 = new File("D:/Test0.txt");
        File file = new File("D:/Test1.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
        ExecutorService executorService = Executors.newScheduledThreadPool(3);
        executorService.execute(() -> {
            try {
                TimeUnit.MINUTES.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file0));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                String string;
                if ((string = bufferedReader.readLine())!= null){
                    bufferedWriter.write(string);
                    bufferedWriter.newLine();
                }
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        executorService.execute(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(LocalTime.now());
        });
        executorService.execute(() -> {
            try {
                TimeUnit.SECONDS.sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            while (true){
                if (file.exists()) {
                    try {
                        System.out.println("复制成功");
                        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                        System.out.println(bufferedReader.readLine());
                        break;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }else {
                    try {
                        System.out.println("检测中");
                        TimeUnit.SECONDS.sleep(30 );
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        });
    }
}
