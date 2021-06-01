import java.io.File;

public class GetFolderSize {
    public static void main(String[] args) {

        File dir = new File("Exercises Resources");
        File[] files = dir.listFiles();

        int size = 0;
        if(files != null){
            for (File file : files) {
                size += file.length();
            }
        }
        System.out.println("Folder size: " + size);
    }
}
