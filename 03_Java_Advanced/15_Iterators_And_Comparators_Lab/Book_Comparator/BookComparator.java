package Book_Comparator;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book f, Book s) {
        int compareResult = f.getTitle().compareTo(s.getTitle());
        return compareResult != 0
                ? compareResult
                : Integer.compare(f.getYear(), s.getYear());
    }
}
