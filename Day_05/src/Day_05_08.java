public class Day_05_08 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int k = 0;
            for (int j = 1; j < i; j++) {
                if (i%j==0){
                    k = k+j;
                }
            }
            if (k==i){
                System.out.println(i);
            }
        }
    }
}
