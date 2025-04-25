package Day_18_1;

import java.util.*;

public class Day_18_1 {
    public static void main(String[] args) {
        List<Card> list = new ArrayList<>();
        list.add(new Card(1,"大王"));
        list.add(new Card(2,"小王"));
        String[]color = new String[]{"黑桃","红桃", "梅花","方块"};
        String[]word = new String[]{"A","K","Q","J","10","9","8","7","6","5","4","3","2"};
        int a = 3;
        for (int i=0;i<color.length;i++) {
            for (int j=0;j<word.length;j++) {
                list.add(new Card(a,color[i]+word[j]));
                a+=1;
            }
        }
        Collections.shuffle(list);
        TreeSet<Card> set = new TreeSet<>(new Comparator<Card>() {

            @Override
            public int compare(Card o1, Card o2) {
                return Integer.compare(o1.getNumber(),o2.getNumber());
            }
        });
        TreeSet<Card> set2 = new TreeSet<>(new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return Integer.compare(o1.getNumber(),o2.getNumber());
            }
        });
        TreeSet<Card> set3 = new TreeSet<>(new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return Integer.compare(o1.getNumber(),o2.getNumber());
            }
        });
        TreeSet<Card> set4 = new TreeSet<>(new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return Integer.compare(o1.getNumber(),o2.getNumber());
            }
        });
        int i = 0;
        int j = 0;
        while (j<51) {
            set.add(list.get(i));
            list.remove(i);
            set2.add(list.get(i));
            list.remove(i);
            set3.add(list.get(i));
            list.remove(i);
            j+=3;
        }
        System.out.println(set);
        System.out.println(set2);
        System.out.println(set3);
        for (Card c : list) {
            System.out.print(c.toString()+",");
        }




    }

}
