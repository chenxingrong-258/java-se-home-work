package Day_27_1;

import java.util.concurrent.locks.ReentrantLock;

public class Day_27_1 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Thread t1 = new Thread(() -> {
            lock.lock();
            System.out.println(Thread.currentThread().getName()+"执行："+"生产超级兵");
            lock.unlock();
        });
        Thread t2 = new Thread(() -> {
            lock.lock();
            System.out.println(Thread.currentThread().getName()+"执行："+"攻击防御塔");
            lock.unlock();
        });
        t1.start();
        t2.start();
    }

}
