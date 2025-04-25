public class Day_05_05 {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            for (int j=0;j<10+i;j++){
                if (j<i){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
