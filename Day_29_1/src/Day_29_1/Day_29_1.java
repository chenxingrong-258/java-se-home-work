package Day_29_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ResourceBundle;

public class Day_29_1 {
    public static void main(String[] args) throws IOException {
        ResourceBundle rb = ResourceBundle.getBundle("Day_29_1.config");
        String class1 = "";
        StringBuffer sb = new StringBuffer(class1);
        sb.append("package Day_29_1;").append("\n").append("\n");
        String string = rb.getString("class.name");
        String[] split = string.split("\\.");
        sb.append("public class ").append(split[1]).append(" {\n");
        String yield = rb.getString("property.names");
        String type = rb.getString("property.types");
        String[] yields = yield.split(",");
        String[] types = type.split(",");
        for (int i = 0; i < yields.length; i++) {
            sb.append("\t").append("private ").append(types[i]).append(" ").append(yields[i]).append(";\n");
        }
        sb.append("\t").append("public").append(" ").append(split[1]).append("(").append(types[0]).append(" ").append(yields[0]).append(",")
                .append(types[1]).append(" ").append(yields[1]).append(",").append(types[2]).append(" ").append(yields[2]).append(")").append("{\n");
        for (int i = 0; i < yields.length; i++) {
            sb.append("\t\t").append("this.").append(yields[i]).append(" = ").append(yields[i]).append(";\n");
        }
        sb.append("\t").append("}").append("\n");
        sb.append("\t").append("public").append(" ").append(split[1]).append("(){\n").append("\t").append("}\n");
        System.out.println(sb.toString());
        for (int i = 0; i < yields.length; i++) {
            sb.append("\t").append("public ").append(types[i]).append(" ").append("get").append(yields[i].substring(0,1).toUpperCase()+yields[i].
                            substring(1)).append("(){\n").append("\t\t").append("return ").append(yields[i]).append(";\n\t}\n");
        }
        for (int i = 0; i < yields.length; i++) {
            sb.append("\t").append("public ").append("void ").append("set").append(yields[i].substring(0,1).toUpperCase()+yields[i].substring(1)).
            append("(").append(types[i]).append(" ").append(yields[i]).append(")").append("{\n").append("\t\t").append("this.").append(yields[i]).append(" = ").append(yields[i]).append(";\n").append("\t}\n");
        }
        sb.append("\n\t").append("public").append(" ").append("String").append(" toString()").append("{\n").append("\t\t").append("return \"Student{\"").append(" + ").append("\n\t\t\t\t").append("\"'name = \"").append(" + ").
                append(yields[0]).append(" + ").append("'\\''").append(" + ").append("\n\t\t\t\t").append("\", age=\"").append(" + ").append(yields[1]).append(" + ").append("\n\t\t\t\t").append("\", gender='\"").append(" + ")
                .append(yields[2]).append(" + ").append("'\\''").append(" + ").append("\n\t\t\t\t").append("'}'").append(";").append("\n\t\t}").append("\n\t").append("}").append("\n");
        System.out.println(sb.toString());
        FileWriter fileWriter = new FileWriter("C:\\Users\\86198\\IdeaProjects\\Core_Java\\Day_29_1\\src\\Day_29_1\\Student.java");
        fileWriter.write(sb.toString());
        fileWriter.close();
    }
}
