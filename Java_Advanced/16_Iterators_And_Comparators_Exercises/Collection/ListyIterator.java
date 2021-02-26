package Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class ListyIterator implements Iterable<String> {
    private List<String> list;
    private int index;

    public ListyIterator(List<String> list) {
        this.list = list;
    }

    public boolean move() {
        if (hasNext()) {
            index++;
            return true;
        }
        return false;
    }

    public boolean hasNext() {
        return index < list.size() - 1;
    }

    public void print() {
        if (list.isEmpty()) {
            System.out.println("Invalid Operation!");
            System.exit(0);
        }
        System.out.println(list.get(index));
    }

    public void printAll(){
        list.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

//    @Override
//    public void forEach(Consumer<? super String> action) {
//        list.forEach(action);
//    }

    @Override
    public Spliterator<String> spliterator() {
        return null;
    }
}
