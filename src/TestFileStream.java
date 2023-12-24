import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream {
    public static void main(String[] args) {
        try {
            FileOutputStream output = new FileOutputStream("temp.dat");
            for (int i = 0; i <= 10; i++) {
                output.write(i);
            }
            FileInputStream input = new FileInputStream("temp.dat");
            int value;
            while ((value = input.read()) != -1)
                System.out.println(value + " ");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
