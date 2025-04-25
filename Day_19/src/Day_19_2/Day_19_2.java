package Day_19_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Day_19_2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        HashMap<String, Integer> map3 = new HashMap<>();
        HashMap<String, Integer> map4 = new HashMap<>();
        map1.put("语文", 98);
        map2.put("语文", 98);
        map3.put("语文", 95);
        map4.put("语文", 90);
        map1.put("数学", 70);
        map2.put("数学", 80);
        map3.put("数学", 85);
        map4.put("数学", 50);
        map1.put("英语", 60);
        map2.put("英语", 85);
        map3.put("英语", 55);
        map4.put("英语", 58);
        map1.put("地理", 95);
        map2.put("地理", 90);
        map3.put("地理", 80);
        map4.put("地理", 70);
        int sum1 = 0;
        for (Integer value : map1.values()) {
            sum1 += value;
        }
        System.out.println("总成绩为"+sum1+"，平均成绩为"+(double)sum1/map1.size());
        int sum2 = 0;
        for (Integer value : map2.values()) {
            sum2 += value;
        }
        System.out.println("总成绩为"+sum2+"，平均成绩为"+(double)sum2/map2.size());
        int sum3 = 0;
        for (Integer value : map3.values()) {
            sum3 += value;
        }
        System.out.println("总成绩为"+sum3+"，平均成绩为"+(double)sum3/map3.size());
        int sum4 = 0;
        for (Integer value : map4.values()) {
            sum4 += value;
        }
        System.out.println("总成绩为"+sum4+"，平均成绩为"+sum4/map4.size());
        sum1 = map1.get("语文")+map2.get("语文")+map3.get("语文")+map4.get("语文");
        System.out.println("语文学科总成绩为"+sum1+",平均成绩为"+(double)sum1/map1.size());
        sum2 = map1.get("数学")+map2.get("数学")+map3.get("数学")+map4.get("数学");
        System.out.println("数学学科总成绩为"+sum2+",平均成绩为"+(double)sum2/map2.size());
        sum3 = map1.get("英语")+map2.get("英语")+map3.get("英语")+map4.get("英语");
        System.out.println("英语学科总成绩为"+sum3+",平均成绩为"+(double)sum3/map3.size());
        sum4 = map1.get("地理")+map2.get("地理")+map3.get("地理")+map4.get("地理");
        System.out.println("地理学科总成绩为"+sum4+",平均成绩为"+(double)sum4/map4.size());
        int count = 0;
        Map[]maps = {map1, map2, map3, map4};
        for (Map m : maps) {
            for (Object value : m.values()) {
                if ((Integer) value < 60) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
        count = 0;
        for (Map m : maps) {
            for (Object value : m.values()) {
                if ((Integer) value < 66) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
        String[]name ={"李白","杜甫","白居易","李商隐"};
        int i = 0;
        for (Map m : maps) {
            Set entrySet = m.entrySet();
            System.out.println(name[i]+":"+entrySet);
            i++;
        }

    }
}
