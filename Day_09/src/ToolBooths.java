import java.util.Scanner;

public class ToolBooths {

    public Car[] statistic(int x){
        Scanner sc = new Scanner(System.in);
        Car[] cars = new Car[x];
        for (int i = 0; i < x; i++) {
            System.out.print("请输入车辆品牌");
            String brand = sc.next();
            System.out.println("请输入油量");
            double litres = sc.nextDouble();
            cars[i] = new Car(brand,litres);
        }
        return cars;
    }
}
