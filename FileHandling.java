import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {

        try {
            File file = new File("student.txt");

            if (file.createNewFile())
                System.out.println("File Created");

            FileWriter fw = new FileWriter(file);
            fw.write("Welcome to Java File Handling");
            fw.close();

            System.out.println("Data Written Successfully");
        } catch (IOException e) {
            System.out.println("File Error");
        }
    }
}
