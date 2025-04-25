package Day_17_1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Day_17_1 {
    public static void main(String[] args) {
        List<Woreker> list = new ArrayList<Woreker>();
        Woreker woreker1 = new Woreker("李白", "T1032", "男", "吉林省长春市", LocalDate.of(2021, 12, 10), 10000, 25);
        Woreker woreker2 = new Woreker("杜甫", "C1048", "女", "江苏省南京市", LocalDate.of(2017, 10, 10), 12000, 30);
        Woreker woreker3 = new Woreker("白居易", "C1052", "男", "江苏省苏州市", LocalDate.of(2019, 5, 22), 15000, 28);
        Woreker woreker4 = new Woreker("李清照", "T1035", "女", "吉林省吉林市", LocalDate.of(2015, 4, 12), 14000, 31);
        Woreker woreker5 = new Woreker("陆游", "C1044", "男", "江苏省南京市", LocalDate.of(2009, 6, 15), 20000, 40);
        Woreker woreker6 = new Woreker("贺知章", "C1088", "男", "上海市", LocalDate.of(2012, 3, 30), 16000, 35);
        Woreker[] worekers = {woreker1, woreker2, woreker3, woreker4, woreker5, woreker6};
        for (Woreker w : worekers) {
            list.add(w);
        }
        Iterator<Woreker> iterator = list.iterator();
        int count1 = 0;
        int count2 = 0;
        int sum_salary1 = 0;
        int sum_salary2 = 0;
        while (iterator.hasNext()) {
            Woreker w = iterator.next();
            if (w.getNumber().split("1")[0].equals("T")) {
                count1++;
                sum_salary1 += w.getSalary();
            } else if (w.getNumber().split("1")[0].equals("C")) {
                count2++;
                sum_salary2 += w.getSalary();
            }
        }
        System.out.println("测试部门工资总额为" + sum_salary1 + "," + "测试部门平均工资为" + sum_salary1 / count1 + "," + "研发部门工资总额为" + sum_salary2 + "," + "研发部门平均工资为" + sum_salary2 / count2);
        for (Woreker w : list) {
            if (w.getLocation() == "上海市"){
                list.remove(w);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            LocalDate localDate = LocalDate.now();
            if (ChronoUnit.MONTHS.between(list.get(i).getDate(),localDate) > 70) {
                list.get(i).setSalary((int)(list.get(i).getSalary()*1.1));
            }else {
                continue;
            }
        }
    }
}