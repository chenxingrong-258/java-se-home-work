package Day_30_2;

public class UserManagementImp implements UserManagement{
    @Override
    public void updateUser() {
        System.out.println("该员工成功被加入");
    }
    @Override
    public void deleteUser() {
        System.out.println("该员工成功被删除");
    }
}
