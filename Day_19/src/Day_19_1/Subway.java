package Day_19_1;

import java.util.ArrayList;

public class Subway {
    public void priceCalculation(Passenger passenger, Route route) {
        ArrayList<String> list = route.getRoute(passenger);
        route.getRoute(passenger);
        try{
            int numberOfStations = Math.abs(list.indexOf(passenger.getPullOut())-list.indexOf(passenger.getPullIn()));
            if (numberOfStations == 0) {
                System.out.println("请输入正确的站名");
            } else if (numberOfStations <=3) {
            System.out.println(passenger.getName()+"应支付2元");
            } else if (numberOfStations<=5) {
                System.out.println(passenger.getName()+"应支付3元");
            } else if (numberOfStations<=7) {
                System.out.println(passenger.getName()+"应支付4元");
            }else {
                System.out.println(passenger.getName()+"应支付5元");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
