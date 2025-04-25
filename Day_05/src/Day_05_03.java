public class Day_05_03 {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            for (int j = 0; j <= 50; j++) {
                if (i+j==50&&2*i+4*j==120){
                    System.out.println("有"+i+"只鸡"+"有"+j+"只兔子");
                }else {
                    continue;
                }
            }
        }
    }
}
