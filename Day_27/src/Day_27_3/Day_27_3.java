package Day_27_3;

import java.util.concurrent.locks.LockSupport;
public class Day_27_3 {
    static Thread t1;
    static Thread t2;
    static Thread t3;
    public static void main(String[] args) throws InterruptedException {
        DivideTask divideTask = new DivideTask(3);
        t1 = new Thread(() -> {
            try {
                divideTask.divide("购买商品下单", t2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t2 = new Thread(() -> {
            try {
                divideTask.divide("使用微信付款",t3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t3 = new Thread(() -> {
            try {
                divideTask.divide("个人账户积分",t1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
        t3.start();
        LockSupport.unpark(t1);
    }
}
class DivideTask{
    private int num;
    public DivideTask(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void divide(String text,Thread thread ) throws InterruptedException {
        for (int i = 0; i < num; i++) {
            LockSupport.park();
            System.out.println(text);
            LockSupport.unpark(thread);
        }
    }
}