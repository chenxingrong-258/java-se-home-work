package Day_27_4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class Day_27_4 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 30; i++) {
            Passenger passenger = new Passenger("乘客"+i,10);
            executor.execute(passenger);
        }
    }
}
class Passenger implements Runnable {
    private String name;
    private ReentrantLock lock;
    private static int number=10;

    public Passenger(String name, int number) {
        this.name = name;
    }

    public Passenger(String name, ReentrantLock lock, int number) {
        this.name = name;
        this.lock = lock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        try{
            if (number>0){
                number--;
                System.out.println(name + "抢票成功"+"还剩下"+number+"张票");
            }else {
                System.out.println(name+"抢票失败");}
        } finally {
            lock.unlock();
        }
    }
}