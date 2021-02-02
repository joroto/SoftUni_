import java.io.*;

public class LineNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("inputLineNumbers.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("out.txt"));

        String line = reader.readLine();
        int count = 1;

        while (line != null){
            out.println(count++ + ". "+ line);
            line = reader.readLine();
        }
        out.close();
    }
}
