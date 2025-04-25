package Day_23_1;

import java.io.File;

public class Day_23_1 {
    public static void main(String[] args) {
        File[] disks = File.listRoots();
        for (File disk : disks) {
            File[]files = disk.listFiles();
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println(file.lastModified()+"  "+file.getName()+"  "+file.length());
                }if (file.isDirectory()) {
                    System.out.println(file.lastModified()+"  "+"<DIR>"+file.getName()+"  "+file.length());
                }
            }
        }
    }
}
