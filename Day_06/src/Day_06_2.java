public class Day_06_2 {
    public static void main(String[] args) {
        int x[] = new int[7];
        x[0] = (int)(Math.random()*33+1);
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                x[i] = (int)(Math.random()*33+1);
                if (x[i] == x[j]){
                    x[i] = (int)(Math.random()*33+1);
                }else {
                    continue;
                }
            }
        }
        x[6] = (int)(Math.random()*16+1);
        for (int a:x){
            System.out.println(a);
        }
    }
}
