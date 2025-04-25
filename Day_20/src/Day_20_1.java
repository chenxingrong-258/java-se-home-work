import java.util.function.BiFunction;

public class Day_20_1 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunction = (a,b)->a*b;
        System.out.println(calculate(1,2,biFunction));

    }
    public static int calculate(int a, int b, BiFunction<Integer, Integer, Integer> f) {
        return f.apply(a, b);
    }
}
