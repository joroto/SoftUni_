import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("inputLineNumbers.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("out.txt"));

        String line = reader.readLine();
        Map<String, Integer> words = new HashMap<>();

        while (line != null){
            String[] wordsOnLine = line.split(" ");
            for (String word : wordsOnLine) {
                if(words.containsKey(word)){
                    words.put(word, words.get(word) + 1);
                }else {
                    words.put(word, 1);
                }
            }
            line = reader.readLine();
        }
        out.close();

        words.entrySet()
                .stream()
                .sorted((v1, v2) -> v2.getValue().compareTo(v1.getValue()))
                .forEach(v -> System.out.println(v.getKey() + " - "+ v.getValue()));
    }
}
