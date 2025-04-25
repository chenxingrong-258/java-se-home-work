package Day_17_1;

import java.time.LocalDate;

public class Woreker {
    private String name;
    private String number;
    private String gendar;
    private String location;
    private LocalDate date;
    private int salary;
    private int age;

    public Woreker(String name, String number, String gendar, String location, LocalDate date, int salary,int age) {
        this.name = name;
        this.number = number;
        this.gendar = gendar;
        this.location = location;
        this.date = date;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getGendar() {
        return gendar;
    }

    public void setGendar(String gendar) {
        this.gendar = gendar;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Woreker{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", gendar='" + gendar + '\'' +
                ", location='" + location + '\'' +
                ", date=" + date +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
