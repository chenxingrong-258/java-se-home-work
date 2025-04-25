package Day_17_2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Day_17_2 {
    public static void main(String[] args) {
        String [] s = {"13","15","17","18","19"};
        List<String> list = new ArrayList<String>();
        Random r = new Random();
        while (list.size()<=1000){
            String s1 = s[r.nextInt(s.length)]+r.nextLong(999999999);
            if (s1.length() == 11){
                list.add(s1);
            }else {
                continue;
            }
        }
        for (int i = 0; i < 4; i++) {
            Random random = new Random();
            StringBuffer stringBuffer = new StringBuffer(list.get(random.nextInt(list.size())));
            stringBuffer.replace(3,7,"XXXX");
            System.out.println(stringBuffer.toString());
        }
    }
}
