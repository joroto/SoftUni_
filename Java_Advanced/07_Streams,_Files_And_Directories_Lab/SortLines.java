import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class SortLines {
    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Path.of("input.txt"));
        Collections.sort(lines);

        PrintWriter out = new PrintWriter(new FileWriter("out.txt"));

        for (String line : lines) {
            out.println(line);
        }
        out.close();
    }
}
