import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));

        String line = reader.readLine();

        long sum = 0;
        while (line != null){

            for (char ch : line.toCharArray()) {
                sum += ch;
            }

            line = reader.readLine();
        }
        System.out.println(sum);
    }
}
