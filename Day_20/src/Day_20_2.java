import java.util.ArrayList;
import java.util.Random;
import java.util.function.Function;

public class Day_20_2 {
    public static void main(String[] args) {
        Function<Integer,ArrayList<Integer>>function = (n)->{
            Random rand = new Random();
            rand.setSeed(100);
            ArrayList<Integer> list=new ArrayList<>();
            for (Integer i = 0; i < n; i++) {
                list.add(new Random().nextInt(100));
            }
            return list;
        };
        integers(100,function);
        System.out.println(integers(100,function).toString());
    }
    public static ArrayList<Integer> integers(int n, Function<Integer,ArrayList<Integer>>function){
        return function.apply(n);
    }


}
