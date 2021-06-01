package Book_Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book> {
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }

    private void setAuthors(String... authors){
        if(authors.length == 0){
            this.authors = new ArrayList<>();
        }else {
            this.authors = new ArrayList<>(Arrays.asList(authors));
        }
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    @Override
    public int compareTo(Book o) {
        int compareResult = title.compareTo(o.title);
        if(compareResult == 0){
            compareResult = Integer.compare(this.year, o.year);
        }
        return compareResult;
    }

    @Override
    public String toString() {
        return '{' + title + '}';
    }
}
