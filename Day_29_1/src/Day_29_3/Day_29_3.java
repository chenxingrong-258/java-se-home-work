package Day_29_3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import Day_29_1.Student;

public class Day_29_3 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<String>arrayList=new ArrayList<>();
        Method add = arrayList.getClass().getMethod("add", Object.class);
        Object invoke = add.invoke(arrayList, 3);
        Object invoke1 = add.invoke(arrayList, 2);
        System.out.println(arrayList);


    }
}
