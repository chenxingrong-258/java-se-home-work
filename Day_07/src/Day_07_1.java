import java.util.Arrays;

public class Day_07_1 {
    public static void main(String[] args) {
        double x[] = new double[]{3.1415,5.6789,4.523,7.658};
        Count(x);
    }
    public static void Count(double x[]){
        for (int i = 0; i < x.length; i++){
            x[i] = (int) (x[i]*100);
            int b = (int) (x[i]%10);
            if (b>=5){
                x[i] = (x[i]+1)/100;
            }else {
                x[i] = (x[i])/100;
            }
        }
        System.out.println(Arrays.toString(x));
    }
}
