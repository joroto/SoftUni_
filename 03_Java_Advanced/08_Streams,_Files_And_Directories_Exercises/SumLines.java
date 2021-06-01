import java.io.*;

public class SumLines {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));

        String line = reader.readLine();

        while (line != null){
            long sum = 0;

            for (char ch : line.toCharArray()) {
                sum += ch;
            }
            System.out.println(sum);

            line = reader.readLine();
        }
    }
}
