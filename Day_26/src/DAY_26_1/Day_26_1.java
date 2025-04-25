package DAY_26_1;

public class Day_26_1 {
    static final Object lock = new Object();
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            System.out.println("学生准备睡5秒在上课");
            synchronized (lock) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("学生准备上课");
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("上课");
            }
            synchronized (lock) {
                lock.notify();
            }
        });
        t1.start();
        t2.start();
    }
}
