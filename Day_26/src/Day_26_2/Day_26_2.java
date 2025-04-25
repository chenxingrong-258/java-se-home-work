package Day_26_2;

public class Day_26_2 {
    static final Object lock = new Object();
    public static void main(String[] args) {
        through("张三");
        through("李四");
        through("王五");

    }
    public static void through(String name){
        Thread thread = new Thread(()->{
            synchronized (lock){
                System.out.println(Thread.currentThread().getName()+"进入山洞");
                try {
                    lock.wait(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+"离开山洞");
            }
        },name);
        thread.start();
    }
}
