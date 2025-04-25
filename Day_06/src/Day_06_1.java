import java.lang.reflect.Array;
import java.util.Arrays;

public class Day_06_1 {
    public static void main(String[] args) {
        int x[] = new int[]{12,23,43,31,53};
        int y[] = Arrays.copyOf(x,5);
        Arrays.sort(x);
        boolean a=Arrays.equals(x,y);
        System.out.println(a);
    }
}
