package Day_29_4;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Tool {
    public Object tool1(String className, String methodName, Class<?>[] parameterTypes, Object[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<?> aClass = Class.forName(className);
        Method method = aClass.getMethod(methodName, parameterTypes);
        Object instance = aClass.getDeclaredConstructor().newInstance();
        return method.invoke(instance, args);
    }
    public Object tool2(String ObjectName,String fieldName,Object object2) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName(ObjectName);
        Field field = aClass.getDeclaredField(fieldName);
        field.setAccessible(true);
        Object o = aClass.getDeclaredConstructor().newInstance();
        field.set(o, object2);
        return o;
    }
    public Object tool3(String ObjectName,String[]fieldNames,Class<?>[] parameterTypes, Object[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName(ObjectName);
        if (fieldNames.length != parameterTypes.length){
            System.out.println("参数数量和属性数量不一致");
            return null;
        }else {
            Object o = aClass.getDeclaredConstructor().newInstance();
            for (int i = 0; i < fieldNames.length; i++){
                Field declaredField = aClass.getDeclaredField(fieldNames[i]);
                declaredField.setAccessible(true);
                declaredField.set(o, args[i]);
            }
            return o;
        }
    }
}
