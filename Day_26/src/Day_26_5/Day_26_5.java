package Day_26_5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

public class Day_26_5 {
    public static void main(String[] args) {
        Deque<String> queen = new ArrayDeque<>();
        MessageQueen messageQueen = new MessageQueen(queen);
        new Thread(() -> {
            try {
                messageQueen.add(queen,"消息1");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"线程一").start();
        new Thread(() -> {
            try {
                messageQueen.add(queen,"消息2");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"线程二").start();
        new Thread(() -> {
            try {
                messageQueen.add(queen,"消息3");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"线程三").start();
        new Thread(() -> {
            try {
                messageQueen.print(queen);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"线程四").start();
    }
}
class MessageQueen{
    private Queue<String> queue;

    public MessageQueen(Queue<String> queue) {
        this.queue = queue;
    }

    public Queue<String> getQueue() {
        return queue;
    }

    public void setQueue(Queue<String> queue) {
        this.queue = queue;
    }
    public void print(Queue<String> queue) throws InterruptedException {
        while (true){
            synchronized (this) {
                if (queue.isEmpty()){
                    this.wait();
                }else {
                    System.out.println(queue.element()+"消息已被读取");
                    queue.remove();
                    this.notify();
                    TimeUnit.SECONDS.sleep(1);
                }
            }
        }
    }
    public void add(Queue<String> queue,String message) throws InterruptedException {
        synchronized (this){
            while (true){
                if (queue.size()>=2){
                    this.wait();
                }else {
                    queue.add(message);
                    System.out.println(Thread.currentThread().getName()+"执行,"+message+"加入到消息队列中");
                    this.notify();
                }
            }
        }
    }
}