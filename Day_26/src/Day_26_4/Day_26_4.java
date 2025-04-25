package Day_26_4;

import java.util.concurrent.TimeUnit;

public class Day_26_4 {
    static final Object lock = new Object();
    public static void main(String[] args) throws InterruptedException {
        TaskDivided taskDivided = new TaskDivided(15,1);
        new Thread(()-> {
            try {
                taskDivided.finish("生产超级兵",1,2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"生产超级兵").start();
        new Thread(()-> {
            try {
                taskDivided.finish("超级兵移动",2,3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"超级兵移动").start();
        new Thread(()-> {
            try {
            taskDivided.finish("攻击防御塔",3,1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    },"攻击防御塔").start();
    }
}
class TaskDivided{
    private int num;
    private int flag;
    public TaskDivided(int num, int flag) {
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
    public void finish(String name,int start,int end) throws InterruptedException {
        for (int i = 0; i < num; i++) {
            synchronized (this){
                if (flag != start) {
                    this.wait();
                }else {
                    System.out.println(name);
                    flag = end;
                    this.notifyAll();
                }
            }
        }
    }
}