public class Day_10_1 {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("杜甫",18000,"因为编码出现bug","程序员");
        Tester tester = new Tester("白居易",12000,"因为bug没测试出来","测试员");
        Artist artist = new Artist("李商隐",7000,"因为设计不合理","美工人员");
        Hr hr = new Hr("李白","人事管理");
        Account account = new Account("李清照","财会");
        hr.fire(programmer);
        account.paySalary(programmer);
        hr.fire(tester);
        account.paySalary(tester);
        hr.fire(artist);
        account.paySalary(artist);
    }
}
class Worker{
    private String name;
    private int salary;
    private String workwrong;
    private String work;
    public Worker(String name, int salary, String workwrong, String work) {
        this.name = name;
        this.salary = salary;
        this.workwrong = workwrong;
        this.work = work;
    }
    public Worker() {

    }
    public Worker(String name,String work){
        this.name = name;
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getWorkwrong() {
        return workwrong;
    }

    public void setWorkwrong(String workwrong) {
        this.workwrong = workwrong;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
}
class Programmer extends Worker{
    public Programmer(String name, int salary, String workwrong, String work) {
        super(name, salary, workwrong, work);
    }
}
class Tester extends Worker{
    public Tester(String name, int salary, String workwrong, String work) {
        super(name, salary, workwrong, work);
    }
}
class Artist extends Worker{
    public Artist(String name, int salary, String workwrong, String work) {
        super(name, salary, workwrong, work);
    }
}
class Account extends Worker{
    public Account(String name,  String work) {
        super(name, work);
    }
    public void paySalary(Worker worker){
        if (worker instanceof Tester){
            System.out.println(this.getWork()+this.getName()+"结算"+worker.getName()+(worker.getSalary()-1000)+"因为导致客户使用软件出现损失,扣除1000元");
        }else {
            System.out.println(this.getWork()+this.getName()+"结算"+worker.getName()+worker.getSalary());
        }
    }
}
class Hr extends Worker{
    public Hr(String name, String work) {
        super(name, work);
    }
    public void fire(Worker worker){
        if (worker instanceof Programmer){
            System.out.println(this.getWork()+this.getName()+"打算开除"+worker.getWork()+worker.getName()+','+worker.getWorkwrong()+"后来因为程序员比较难招聘，所以给杜甫一次机会");
        }else {
            System.out.println(this.getWork()+this.getName()+"开除"+worker.getWork()+worker.getName()+','+worker.getWorkwrong());
        }
    }
}

