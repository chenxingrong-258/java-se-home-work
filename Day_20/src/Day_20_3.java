import java.util.ArrayList;
import java.util.Random;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Day_20_3 {
    public static <Arraylist> void main(String[] args) {
        Function<Integer, ArrayList<Integer>> function = (n)->{
            Random rand = new Random();
            rand.setSeed(100);
            ArrayList<Integer> list=new ArrayList<>();
            for (Integer i = 0; i < n; i++) {
                list.add(new Random().nextInt(100));
            }
            return list;
        };
        System.out.println(integers(100,function));
        ArrayList<Integer> list= integers(100,function);
        UnaryOperator<ArrayList<Integer>> f = (list1)->{
            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i)%2 != 0&&i != list1.size()-1) {
                    list1.remove(list1.get(i));
                    while (list1.get(i)%2 != 0&&i<list1.size())
                    {
                        list1.remove(list1.get(i));
                    }
                }
            }
            return list1;
        };
        System.out.println(fliter(f, list));
    }
    public static ArrayList<Integer> integers(int n, Function<Integer,ArrayList<Integer>>function){
        return function.apply(n);
    }
    public static ArrayList<Integer> fliter(UnaryOperator<ArrayList<Integer>> f,ArrayList<Integer>list){
        return f.apply(list);
    }


}