package Day_30_2;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.time.LocalTime;
import java.util.Scanner;

public class MyHandler implements InvocationHandler {
    private Object object;
    public MyHandler(Object object) {
        this.object = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        boolean register = register();
        if (register) {
            Object invoke = method.invoke(object, args);
            if (object.getClass().getName().equals("Day_30_2.FinancialManagementImp")){
                log(method);
            }
            return invoke;
        }else {
            return null;
        }

    }
    public boolean register() throws NoSuchFieldException {
        Class<Register> registerClass = Register.class;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = scanner.nextLine();
        Field declaredField = registerClass.getDeclaredField("user_name");
        String userName = declaredField.getDeclaredAnnotation(Annovation1.class).user_name();
        if (!name.equals(userName)) {
            System.out.println("用户名输入错误");
            return false;
        }else {
            System.out.println("请输入密码");
            String password1 = scanner.nextLine();
            Field declaredField1 = registerClass.getDeclaredField("password");
            String password = declaredField1.getDeclaredAnnotation(Annovation1.class).password();
            if (!password.equals(password1)) {
                System.out.println("密码输入错误");
                return false;
            }else {
                System.out.println("登入成功");
                return true;
            }

        }
    }
    public void log(Method method) throws NoSuchFieldException, IOException {
        Class<Register> registerClass = Register.class;
        Field declaredField = registerClass.getDeclaredField("user_name");
        String userName = declaredField.getDeclaredAnnotation(Annovation1.class).user_name();
        StringBuffer sb = new StringBuffer();
        sb.append(userName).append(",").append(LocalTime.now()).append(",").append(method.getName()).append(",").append(object.getClass().getName());
        FileWriter fileWriter = new FileWriter("D:\\log.txt");
        fileWriter.write(sb.toString());
        fileWriter.close();
        System.out.println("文件日志已上传");
    }
}
