import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Songs {
public static class Song {
    private String typeList;
    private String name;
    private String time;

    public void setTypeList(String typeList) {
        this.typeList = typeList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTypeList() {
        return typeList;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] line = scan.nextLine().split("_");

            Song song = new Song();

            song.setTypeList(line[0]);
            song.setName(line[1]);
            song.setTime(line[2]);

            songs.add(song);
        }

        String typeList = scan.nextLine();

        if (typeList.equals("all")){
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        }else {
            for (Song song : songs) {
                if (song.getTypeList().equals(typeList)){
                    System.out.println(song.getName());
                }
            }
        }
    }
}

