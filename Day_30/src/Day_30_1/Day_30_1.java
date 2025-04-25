package Day_30_1;

import java.lang.reflect.Field;

public class Day_30_1 {
    public static void main(String[] args) throws NoSuchFieldException {
        Class<Student> studentClass = Student.class;
        Field declaredField = studentClass.getDeclaredField("name");
        String value = declaredField.getDeclaredAnnotation(Annotation.class).value();
        System.out.println(value);
    }
}
class Student {
    @Annotation("张三")
    String name;

}
