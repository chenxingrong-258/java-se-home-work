package Day_24_3;

import Day_24_1.User;
import Day_24_2.Day_24_2;

import java.io.*;
import java.util.ResourceBundle;

public class Day_24_3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User register = Day_24_2.register();
        if (register == null) {
            System.out.println("登入失败");
        }else {
            long startTime = System.currentTimeMillis();
            Student student = new Student();
            student.setAge(Integer.parseInt(get("student.age")));
            student.setName(get("student.name"));
            Teacher teacher = new Teacher();
            teacher.setAge(Integer.parseInt(get("teacher.age")));
            teacher.setName(get("teacher.name"));
            serialize(student);
            serialize1(teacher);
            long endTime = System.currentTimeMillis();
            long totalTime = endTime - startTime;
            recording(totalTime,register);
        }
    }
    public static String get(String key){
        ResourceBundle rb = ResourceBundle.getBundle("Day_24_3.people");
        return rb.getString(key);
    }
    public static void serialize(Student student) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\properties"));
        oos.writeObject(student);
        oos.close();
    }
    public static void serialize1(Teacher teacher) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("E:\\properties"));
        dos.writeUTF(teacher.getName());
        dos.writeInt(teacher.getAge());
        dos.close();
    }
    public static void recording(Long time,User user) throws IOException {
        File file1 = new File("E:\\properties");
        File file2 = new File("E:\\log.txt");
        boolean newFile = file2.createNewFile();
        FileWriter fw = new FileWriter(file2,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("操作人："+user.getUser_name()+"操作时间:"+time+"文件大小:"+file1.length());
        bw.close();
    }
}
