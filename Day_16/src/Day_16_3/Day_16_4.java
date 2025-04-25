package Day_16_3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Day_16_4 {
    public static void main(String[] args) {
        Worker worker = new Worker("李白",LocalDate.of(2018,2,4),8000);
        Worker worker2 = new Worker("杜甫",LocalDate.of(2012,5,6),12000);
        Worker worker3 = new Worker("白居易",LocalDate.of(2014,4,10),10000);
        Worker worker4 = new Worker("陆游",LocalDate.of(2016,10,11),9000);
        Worker [] workers = {worker,worker2,worker3,worker4};
        SalaryChange salaryChange = new SalaryChange();
        for (Worker w : workers){
            salaryChange.wagesrise(w);
        }
    }
}
class Worker{
    String name;
    LocalDate dateOnBoard;
    int salary;
    public Worker(String name, LocalDate dateOnBoard, int salary) {
        this.name = name;
        this.dateOnBoard = dateOnBoard;
        this.salary = salary;
    }

    public Worker() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOnBoard() {
        return dateOnBoard;
    }

    public void setDateOnBoard(LocalDate dateOnBoard) {
        this.dateOnBoard = dateOnBoard;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
class SalaryChange{
    public void wagesrise(Worker worker){
        LocalDate dateOnBoard = worker.dateOnBoard;
        LocalDate today = LocalDate.now();
        int salary = worker.salary;
        if (ChronoUnit.MONTHS.between(dateOnBoard,today)>=100){
            salary = salary+1000;
            System.out.println(worker.getName()+"工资上升至"+salary);
        }else {
            System.out.println(worker.getName()+"因工作时长不满100个月,工资仍为"+salary);
        }
    }
}