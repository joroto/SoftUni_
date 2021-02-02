import java.io.*;
import java.util.Scanner;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new FileInputStream("input.txt"));

        BufferedReader in = new BufferedReader(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("out.txt"));

        int count = -1;
        while (in.readLine() != null){
            if(count % 3 == 0) {
                out.println(in.readLine());
                count++;
            }
            count++;
        }
        out.close();
    }
}
