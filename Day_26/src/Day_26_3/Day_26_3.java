package Day_26_3;

public class Day_26_3 {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println("生产超级兵");
        });
        Thread thread1 = new Thread(()->{
            System.out.println("攻击防御塔");
        });
        thread.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread.start();
        thread1.start();
    }
}
