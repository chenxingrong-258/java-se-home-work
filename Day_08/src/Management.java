public class Management {
    void check(Student student){
        int a = student.getAge();
        if (a>=18){
            System.out.println("可以上网");
        }else {
            System.out.println("不可以上网");
        }
    }
}
