import java.util.Scanner;

public class Day_12_02 {
    public static void main(String[] args) {
        String [] s = new String[]{"123456789123456789","123456789987654321","098765432112345678"};
        System.out.println("请输入身份证号：");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (String a:s){
            if (a.equals(str)){
                try{
                    throw new IdentificationException();
                }catch (IdentificationException e){
                    System.out.println(e);
                    }
                }
            }
        }
    }


class IdentificationException extends Exception {
    public IdentificationException() {
        super("该身份证属于在逃人员");
    }
    public IdentificationException(String message) {
        super("该身份证属于在逃人员");
    }
}