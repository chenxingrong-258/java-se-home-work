package Day_15_1;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Day_15_1 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new Task(),0,2000);
    }
}
class Task extends TimerTask{
    public void run() {
        Random rand = new Random();
        int a = rand.nextInt(1000);
        System.out.println(a);
    }
}
