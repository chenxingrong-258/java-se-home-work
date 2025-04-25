package Day_18_2;

import Day_17_1.Woreker;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Day_18_2 {
    public static void main(String[] args) {
        Woreker woreker1 = new Woreker("李白", "T1032", "男", "吉林省长春市", LocalDate.of(2021, 12, 10), 10000, 25);
        Woreker woreker2 = new Woreker("杜甫", "C1048", "女", "江苏省南京市", LocalDate.of(2017, 10, 10), 12000, 30);
        Woreker woreker3 = new Woreker("白居易", "C1052", "男", "江苏省苏州市", LocalDate.of(2019, 5, 22), 15000, 28);
        Woreker woreker4 = new Woreker("李清照", "T1035", "女", "吉林省吉林市", LocalDate.of(2015, 4, 12), 14000, 31);
        Woreker woreker5 = new Woreker("陆游", "C1044", "男", "江苏省南京市", LocalDate.of(2019, 5, 22), 20000, 40);
        Woreker woreker6 = new Woreker("贺知章", "C1088", "男", "上海市", LocalDate.of(2012, 3, 30), 16000, 35);
        Woreker [] worekers = {woreker1, woreker2, woreker3, woreker4, woreker5, woreker6};
        TreeSet<Woreker>set = new TreeSet<>(new Comparator<Woreker>() {
            @Override
            public int compare(Woreker o1, Woreker o2) {
                int i = o1.getDate().compareTo(o2.getDate());
                if (i !=0) {
                    return o1.getDate().compareTo(o2.getDate());
                }else {
                    return (Integer.compare(o1.getSalary(), o2.getSalary())*(-1));
                }
            }
        });
        System.out.println(set.size());
        Collections.addAll(set, worekers);
        System.out.println(set.toString());

    }
}
