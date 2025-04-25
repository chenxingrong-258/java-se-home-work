package Day_25_2;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Day_25_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Thread t1 = new Thread(() -> {
            int sum1 = 0;
            while (sum1<100){
                int a = rand.nextInt(1,3);
                sum1+=a;
            }
            System.out.println("乌龟完成比赛");
        });
        Thread t2 = new Thread(() -> {
            int sum2 = 0;
            while (sum2<70){
                int b = rand.nextInt(3,5);
                sum2+=b;
            }
            try {
                TimeUnit.MILLISECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            while (sum2<100){
                int c = rand.nextInt(3,5);
                sum2+=c;
            }
            System.out.println("兔子完成比赛");
        });
        t1.start();
        t2.start();
    }

}
