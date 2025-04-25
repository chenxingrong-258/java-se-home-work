import java.util.Arrays;

public class Day_06_3 {
    public static void main(String[] args) {
        int x[] = new int[]{1,2,3,4,2,1,3,5,6,9,5};
        int y[] = new int[x.length-1];
        int a = 0;
        y[0] = x[0];
        for (int i = 1; i <= x.length-1; i++) {
            for (int j = 0; j < i; j++) {
                if (x[i] == x[j]){
                    a++;
                    break;
                }else {
                    y[i-a] = x[i];
                }
            }
        }
        System.out.println(a);
        int z[] = new int[x.length-a];
        System.arraycopy(y,0,z,0,x.length-4);
        System.out.println(Arrays.toString(z));
    }
}
