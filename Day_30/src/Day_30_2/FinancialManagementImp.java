package Day_30_2;

public class FinancialManagementImp implements FinancialManagement {

    @Override
    public void outPut() {
        System.out.println("资金成功被提取");
    }

    @Override
    public void inPut() {
        System.out.println("资金成功被存入");
    }
}
