package Day_25_1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class Day_25_1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread thread = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        int sum = 0;
                        for (int i = 0; i <= 1000; i++) {
                            sum += i;
                        }
                        TimeUnit seconds = TimeUnit.SECONDS;
                        try {
                            seconds.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println(sum);
                    }
                }
        );
        FutureTask<Integer>futureTask = new FutureTask<>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 0; i <= 1000; i++) {
                    sum += i;
                }
                return sum;
            }
        });
        thread.start();
        new Thread(futureTask).start();
        int x = futureTask.get();
        System.out.println(x);
    }
}
