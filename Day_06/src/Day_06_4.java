public class Day_06_4 {
    public static void main(String[] args) {
        String s[][] = new String[4][13];
        String s1[] = new String[]{"红桃","方块","梅花","黑桃"};
        String s2[] = new String[]{"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                System.out.print(s1[i] + s2[j] +"\t");
            }
        }
    }
}
