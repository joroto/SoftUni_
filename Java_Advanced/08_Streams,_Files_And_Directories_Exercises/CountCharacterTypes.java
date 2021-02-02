import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));

        String line = reader.readLine();
        Character[] vowels = {'a','e','i','o','u'};
        Character[] punctuation = {',','.','?','!'};

        List<Character> vowelsList = Arrays.asList(vowels);
        List<Character> punctuationList = Arrays.asList(punctuation);

        int vowelsCount = 0;
        int consonantsCount = 0;
        int punctuationCount = 0;
        while (line != null){

            for (char ch : line.toCharArray()) {
                if(vowelsList.contains(ch)){
                    vowelsCount++;
                }else if(punctuationList.contains(ch)){
                    punctuationCount++;
                }else if(ch != ' '){
                    consonantsCount++;
                }
            }
            line = reader.readLine();
        }
        System.out.println("Vowels: " + vowelsCount);
        System.out.println("Consonants: " + consonantsCount);
        System.out.println("Punctuation: " + punctuationCount);
    }
}
