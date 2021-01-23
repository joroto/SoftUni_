import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Articles2 {
    public static class Article {
        String Title;
        String Content;
        String Author;

        public Article(String title, String content, String author) {
            Title = title;
            Content = content;
            Author = author;
        }

        public String getTitle() {
            return Title;
        }

        public String getContent() {
            return Content;
        }

        public String getAuthor() {
            return Author;
        }

        public void setTitle(String title) {
            Title = title;
        }

        public void setContent(String content) {
            Content = content;
        }

        public void setAuthor(String author) {
            Author = author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s\n", this.Title, this.Content, this.Author);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List <Article> art = new ArrayList<>();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String [] line = scan.nextLine().split(", ");

            Article article = new Article(line[0], line[1], line[2]);
            art.add(article);
        }
        String command = scan.nextLine();

        switch (command){
            case "title":
                art.stream().sorted(Comparator.comparing(Article::getTitle)).forEach(System.out::print);
                break;
            case "content":
                art.stream().sorted(Comparator.comparing(Article::getContent)).forEach(System.out::print);
                break;
            case "author":
                art.stream().sorted(Comparator.comparing(Article::getAuthor)).forEach(System.out::print);
                break;
        }
    }

}

