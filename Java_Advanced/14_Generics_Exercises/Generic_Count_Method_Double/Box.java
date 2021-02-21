package Generic_Count_Method_Double;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>>{
    private List<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public void addElement(T element){
        this.list.add(element);
    }

    public int countGreater(T element){
        return (int) this.list.stream().filter(e -> e.compareTo(element) > 0).count();
    }

}
