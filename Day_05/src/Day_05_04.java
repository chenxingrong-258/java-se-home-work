public class Day_05_04 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j != 0 && j == i - 1) {
                    System.out.println(i);
                } else if (i % j == 0) {
                    break;
                } else {
                    continue;
                }
            }
        }
    }
}

