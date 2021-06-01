import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream out = new FileOutputStream("out.txt");

        try (FileInputStream fileStream = new FileInputStream("input.txt")){
            int oneByte = fileStream.read();

            while (oneByte > 0){
                if(oneByte == 32 || oneByte == 10){
                    out.write(oneByte);
                    oneByte = fileStream.read();
                    continue;
                }

                String digits = String.valueOf(oneByte);

                for (int i = 0; i < digits.length(); i++) {
                    out.write(digits.charAt(i));
                }

                oneByte = fileStream.read();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
