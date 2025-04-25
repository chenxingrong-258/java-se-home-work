package Day_27_2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Day_27_2 {
    public static void main(String[] args) throws InterruptedException {
        DivideTask divideTask = new DivideTask(9,1);
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition condition = reentrantLock.newCondition();
        new Thread(() -> {
            try {
                divideTask.divide("购买商品下单", 1, 2,reentrantLock,condition);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            }).start();
        new Thread(() -> {
            try {
                divideTask.divide("使用微信付款",2,3,reentrantLock,condition);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        new Thread(() -> {
            try {
                divideTask.divide("个人账户积分",3,1,reentrantLock,condition);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }
}
class DivideTask{
    private int num;
    private int flag;
    public DivideTask(int num, int flag) {
        this.num = num;
        this.flag = flag;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public void divide(String text, int start,int end,ReentrantLock lock,Condition condition) throws InterruptedException {
        for (int i = 0; i < num; i++) {
            try{
                lock.lock();
                if (flag == start) {
                    System.out.println(text);
                    flag = end;
                    condition.signalAll();
                }else {
                    condition.await();
                }
            }finally {
                lock.unlock();
            }
        }
    }
}
