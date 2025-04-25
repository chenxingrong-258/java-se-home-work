public class Day_06_5 {
    public static void main(String[] args) {
        int triangle[][] = new int[11][11];
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j||j == 1) {
                    triangle[i][j] = 1;
                }else {
                    triangle[i][j]=triangle[i-1][j-1]+triangle[i-1][j];
                }
                System.out.print(triangle[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
