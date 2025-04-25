package Day_23_2;

import java.io.File;
import java.io.IOException;

public class Day_23_2 {
    public static void main(String[] args) throws IOException {
        File dir = new File("E:/Test");
        File dir1 = new File("E:/Test0");
        boolean mkdir = dir1.mkdir();
        copy(dir,dir1);
    }
    public static void copy(File from, File to) throws IOException {
        File[] files = from.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                File newFile = new File(to.getAbsoluteFile(), file.getName());
                boolean mkdir = newFile.mkdir();
                boolean b = to.renameTo(newFile);
                copy(file, newFile);
            } else if (file.isFile()) {
                File newFile = new File(to.getAbsoluteFile(), file.getName());
                boolean newFile1 = newFile.createNewFile();
            }
        }
    }
}
