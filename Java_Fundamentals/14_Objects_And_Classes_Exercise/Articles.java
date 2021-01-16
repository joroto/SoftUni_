import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Articles {
    public static class Article{
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
            return String.format("%s - %s: %s", this.Title, this.Content, this.Author);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> list1 =
                Arrays.stream(scan.nextLine()
                        .split(", "))
                        .collect(Collectors.toList());

        String title = list1.get(0);
        String content = list1.get(1);
        String author = list1.get(2);

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String [] command = scan.nextLine().split(": ");

            switch (command[0]){
                case "Edit":
                    article.setContent(command[1]);
                    break;
                case "ChangeAuthor":
                    article.setAuthor(command[1]);
                    break;
                case "Rename":
                    article.setTitle(command[1]);
                    break;
            }
        }

        System.out.println(article);
    }
}

