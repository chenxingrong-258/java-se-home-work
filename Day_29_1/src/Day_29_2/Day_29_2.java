package Day_29_2;

import Day_29_1.Student;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ResourceBundle;

public class Day_29_2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("Day_29_1.Student");
        ResourceBundle rb = ResourceBundle.getBundle("Day_29_2.value");
        Field name = aClass.getDeclaredField("name");
        Object o = aClass.getDeclaredConstructor().newInstance();
        name.setAccessible(true);
        name.set(o,rb.getString("student.name"));
        Field age = aClass.getDeclaredField("age");
        age.setAccessible(true);
        age.set(o,Integer.valueOf(rb.getString("student.age")));
        Field gender = aClass.getDeclaredField("gender");
        gender.setAccessible(true);
        gender.set(o,rb.getString("student.gender"));
        Student student = (Student)o;
        System.out.println(student.toString());
    }
}
