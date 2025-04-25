package Day_29_4;

import Day_29_1.Student;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Day_29_4 {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException, NoSuchFieldException {
        Tool tool = new Tool();
        Object o = tool.tool1("java.util.ArrayList", "add", new Class[]{Object.class}, new Object[]{3});
        System.out.println(o);
        Object o1 = tool.tool2("Day_29_1.Student", "name", "张三");
        System.out.println(o1);
        Object o2 = tool.tool3("Day_29_1.Student", new String[]{"name", "age", "gender"}, new Class[]{String.class, int.class, String.class}, new Object[]{"张三", 19, "男"});
        System.out.println(o2);

    }
}
