package Day_30_2;

import java.lang.reflect.Proxy;

public class Day_30_2 {
    public static void main(String[] args) {
        FinancialManagementImp fmi = new FinancialManagementImp();
        Object o = Proxy.newProxyInstance(fmi.getClass().getClassLoader(), fmi.getClass().getInterfaces(), new MyHandler(fmi));
        FinancialManagement fmi2 = (FinancialManagement) o;
        fmi2.inPut();
        fmi2.outPut();
    }
}
