package Day_21_1;

import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Day_21_1 {
    public static void main(String[] args) {
        ArrayList<Worker> list = new ArrayList<>();
        list.add(new Worker("Y1012","李白","男",29,12000,"研发部", LocalDate.of(2016,10,10)));
        list.add(new Worker("C2404","杜甫","男",28,14000,"产品部",LocalDate.of(2017,9,5)));
        list.add(new Worker("Y1035","白居易","男",27,11000,"研发部",LocalDate.of(2018,5,21)));
        list.add(new Worker("Y1089","李商隐","男",29,15000,"研发部",LocalDate.of(2016,3,19)));
        list.add(new Worker("C2675","李清照","女",24,8000,"产品部",LocalDate.of(2021,7,16)));
        list.add(new Worker("X3021","陆游","男",32,18000,"项目部",LocalDate.of(2014,12,20)));
        long count = list.stream().filter((worker)->(worker.getDepartment() == "产品部" && worker.getSalary()<10000)).count();
        System.out.println(count);

        long count1 = list.stream().filter((worker)->(worker.getDepartment() == "研发部" && worker.getGender() == "男性")).count();
        System.out.println(count1);

        doFliter(list,worker -> worker.getSalary()>10000 && ChronoUnit.YEARS.between(worker.getOnboardDate(),LocalDate.now())>=5);

        long count2 = list.stream().filter(worker -> worker.getDepartment() != "项目部").count();
        System.out.println(count2);

        Stream<Worker>stream = list.stream();
        stream = stream.filter(worker -> ChronoUnit.YEARS.between(worker.getOnboardDate(),LocalDate.now())>=5);
        Optional<Worker>optional = stream.max((o1, o2) -> o1.getSalary()-o2.getSalary());
        System.out.println("入职五年最高工资员工信息"+optional.get());

        Stream<Worker>stream2 = list.stream();
        stream2 = stream2.filter(worker->worker.getDepartment() == "研发部");
        Optional<Worker>optional1 = stream2.min((o1, o2) -> o1.getAge()-o2.getAge());
        System.out.println("研发部年龄员工"+optional1.get());

        Stream<Worker>stream3 = list.stream();
        stream3 = stream3.filter(worker->worker.getDepartment() == "研发部");
        stream3 = stream3.limit(1);
        stream3.forEach(worker -> System.out.println("研发部门员工编号首字母为"+worker.getNumber().charAt(0)));



    }
    public static void doFliter(List<Worker>list, Predicate<Worker> predicate) {
        Stream<Worker> stream = list.stream();
        stream.filter(predicate).forEach(System.out::println);
    }
}
