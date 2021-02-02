import java.io.*;

public class ALLCAPITALS {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("out.txt"));

        String line = reader.readLine();

        while (line != null){
            out.println(line.toUpperCase());
            line = reader.readLine();
        }
        out.close();
    }
}
