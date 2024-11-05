import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            // File myObj = new File("demo1.txt");
            File myObj = new File("D:\\DSA JAVA\\cdac\\FileHandling\\Sample1\\Files\\demo2.txt");
            if(myObj.createNewFile()){
                System.out.println("File created: " + myObj.getName());
            }else{
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("An error Occured");
            e.printStackTrace();
        }
    }
}
