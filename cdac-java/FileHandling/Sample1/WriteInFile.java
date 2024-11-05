import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {
    public static void main(String[] args){
        try {
            FileWriter fw = new FileWriter("D:\\\\DSA JAVA\\\\cdac\\\\FileHandling\\\\Sample1\\\\Files\\\\demo2.txt");
            fw.write("Files in Java might be tricky, but it is fun enough!");
            fw.close();

            System.out.println("Successfully wrote to the file.");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
