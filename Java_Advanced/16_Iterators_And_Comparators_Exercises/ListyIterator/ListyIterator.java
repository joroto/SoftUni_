package ListyIterator;

import java.util.List;

public class ListyIterator {
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
        }else {
            System.out.println(list.get(index));
        }
    }
}
