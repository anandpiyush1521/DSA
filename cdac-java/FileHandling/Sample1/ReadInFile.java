import java.io.File;
import java.util.Scanner;

public class ReadInFile{
    public static void main(String[] args) {
        try {
            File file = new File("D:\\DSA JAVA\\cdac\\FileHandling\\Sample1\\Files\\demo2.txt");
            Scanner myReader = new Scanner(file);

            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}