package Day_21_1;

import java.time.LocalDate;
import java.util.Objects;

public class Worker {
    private String number;
    private String name;
    private String gender;
    private int age;
    private int salary;
    private String department;
    private LocalDate onboardDate;

    public Worker(String number, String name, String gender, int age, int salary, String department, LocalDate onboardDate) {
        this.number = number;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.onboardDate = onboardDate;
    }

    public Worker() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getOnboardDate() {
        return onboardDate;
    }

    public void setOnboardDate(LocalDate onboardDate) {
        this.onboardDate = onboardDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker worker)) return false;
        return age == worker.age && salary == worker.salary && Objects.equals(number, worker.number) && Objects.equals(name, worker.name) && Objects.equals(gender, worker.gender) && Objects.equals(department, worker.department) && Objects.equals(onboardDate, worker.onboardDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, gender, age, salary, department, onboardDate);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", onboardDate=" + onboardDate +
                '}';
    }
}
