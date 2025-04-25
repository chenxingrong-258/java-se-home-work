package Day_19_1;

import java.util.ArrayList;
import java.util.List;

public class Route {
    public ArrayList<String> getRoute(Passenger passenger) {
        if (passenger.getRouteName() == "上行"){
            String[]stations = {"沿山大道站", "凤凰山站", "文德路站", "河滨公园站", "康安路站", "南京工业大学站", "兴隆路站", "万寿路站", "国际健康中心站"};
            ArrayList<String>arrayList = new ArrayList<>();
            arrayList.addAll(List.of(stations));
            return arrayList;
        }else if (passenger.getRouteName() == "下行"){
            String[]stations = {"国际健康中心站", "万寿路站", "兴隆路站", "南京工业大学站", "康安路站", "河滨公园站", "文德路站", "凤凰山站", "沿山大道站"};
            ArrayList<String>arrayList = new ArrayList<>();
            arrayList.addAll(List.of(stations));
            return arrayList;
        }else {
            System.out.println("请输入正确的站名");
            return null;
        }
    }
}
