import java.io.File;
import java.util.Arrays;
import java.util.Collections;

public class NestedFolders {
    public static void main(String[] args) {
        File file = new File("Files-and-Streams");

        if (file.exists()) {
            if (file.isDirectory()) {
                System.out.println(file);
                File[] files = file.listFiles();
                assert files != null;
                Collections.reverse(Arrays.asList(files));
                int count = 0;
                for (File f : files) {
                    if(f.isDirectory()){
                        System.out.println(f.getName());
                        count++;
                    }
                }
                System.out.println("[" + ++count + "] folders");
            }
        }
        //?????
    }
}
