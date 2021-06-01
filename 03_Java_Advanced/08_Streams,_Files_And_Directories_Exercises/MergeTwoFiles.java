import java.io.*;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("inputOne.txt"));
        BufferedReader reader2 = new BufferedReader(new FileReader("inputTwo.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("out.txt"));

        String line = reader.readLine();
        String line2 = reader2.readLine();

        while (line != null){
            out.println(line);
            line = reader.readLine();
        }

        while (line2 != null){
            out.println(line2);
            line2 = reader2.readLine();
        }
        out.close();
    }
}
