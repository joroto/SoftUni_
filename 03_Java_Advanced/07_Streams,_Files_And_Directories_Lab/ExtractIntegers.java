import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("out.txt");

        Scanner scan = new Scanner(new FileInputStream("input.txt"));
        PrintWriter writer = new PrintWriter(new FileOutputStream("out.txt"));

        while (scan.hasNext()){
            if(scan.hasNextInt()){
                writer.println(scan.nextInt());
            }
            scan.next();
        }
        writer.close();
    }
}
