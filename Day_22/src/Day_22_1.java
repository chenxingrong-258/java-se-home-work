import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Day_21_1.Worker;
public class Day_22_1 {
    public static void main(String[] args) {
        ArrayList<Worker> list = new ArrayList<>();
        list.add(new Worker("Y1012","李白","男",29,12000,"研发部", LocalDate.of(2016,10,10)));
        list.add(new Worker("C2404","杜甫","男",28,14000,"产品部",LocalDate.of(2017,9,5)));
        list.add(new Worker("Y1035","白居易","男",27,11000,"研发部",LocalDate.of(2018,5,21)));
        list.add(new Worker("Y1089","李商隐","男",29,15000,"研发部",LocalDate.of(2016,3,19)));
        list.add(new Worker("C2675","李清照","女",24,8000,"产品部",LocalDate.of(2021,7,16)));
        list.add(new Worker("X3021","陆游","男",32,18000,"项目部",LocalDate.of(2014,12,20)));
        list.stream().map(Worker::getDepartment).forEach(System.out::println);

        list.stream().sorted((Comparator.comparing(Worker::getOnboardDate))).limit(1).forEach(System.out::println);

        IntSummaryStatistics sum = list.stream().filter(worker -> worker.getDepartment().equals("研发部")).collect(Collectors.summarizingInt(Worker::getSalary));
        System.out.println((int)sum.getAverage()+","+sum.getSum());

        long count = list.stream().filter(worker -> worker.getName().startsWith("李")).count();
        System.out.println("姓李的员工数量为"+count);

        Stream<Worker> sorted = list.stream().sorted((o1, o2) -> {
            if (o1.getAge() != o2.getAge()) {
                return o1.getAge() - o2.getAge();
            } else {
                return o1.getSalary() - o2.getSalary();
            }
        });
        sorted.forEach(System.out::println);

        Stream<Worker> sorted1 = list.stream().sorted((Comparator.comparing(Worker::getOnboardDate)).reversed());

        Map<String, List<Worker>> collect = list.stream().collect(Collectors.groupingBy(Worker -> {
            if (Worker.getName().length() == 2) {
                return "名字为两个字的员工";
            } else {
                return "名字为三个字的员工";
            }
        }));
        collect.forEach((k, v) -> {
            System.out.println(k);
            v.forEach(System.out::println);
        });

        Stream<Integer> integerStream = list.stream().filter(worker -> worker.getSalary() <= 10000).filter(worker -> worker.getDepartment().equals("产品部")).map(worker -> worker.getSalary() + 1000);

        list.stream().sorted((o1, o2) -> o1.getNumber().charAt(0) - o2.getNumber().charAt(0)).forEach(worker -> System.out.println(worker.getNumber()));

        String name = list.stream().map(Worker::getName).collect(Collectors.joining(","));
        String[] split = name.split(",");
        System.out.println(Arrays.toString(split));


    }
}
