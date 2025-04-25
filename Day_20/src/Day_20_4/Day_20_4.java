package Day_20_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.BiFunction;

public class Day_20_4 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        BiFunction<String, Integer, Student> biFunction = Student::new;
        list.add(biFunction.apply("张三",16));
        list.add(biFunction.apply("王五",19));
        list.add(biFunction.apply("李四",18));
        Collections.sort(list, (o1, o2) -> Integer.compare(o1.getAge(),o2.getAge()));
        System.out.println(list.toString());
    }
}
