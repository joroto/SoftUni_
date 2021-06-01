import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream out = new FileOutputStream("out.txt");

        try (FileInputStream fileStream = new FileInputStream("input.txt")){
            int oneByte = fileStream.read();

            while (oneByte > 0){
                if(!(oneByte == ',' || oneByte == '.' || oneByte == '!' || oneByte == '?')){
                    out.write(oneByte);
                }
                oneByte = fileStream.read();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
