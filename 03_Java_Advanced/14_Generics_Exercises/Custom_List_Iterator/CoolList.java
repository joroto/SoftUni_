package Custom_List_Sorter;

import java.util.*;
import java.util.function.Consumer;

public class CoolList <T extends Comparable<T>>  {
    private List<T> data;


    public CoolList() {
        this.data = new ArrayList<>();
    }

    public void add(T element){
        data.add(element);
    }

    public void remove(int index){
        data.remove(index);
    }

    public boolean contains(T element){
        return data.contains(element);
    }

    public void swap(int index1, int index2){
        T temp = this.data.get (index1);
        this.data.set (index1, this.data.get(index2));
        this.data.set (index2, temp);
    }

    public int countGreaterThan(T element){
        return (int) data.stream().filter(e -> e.compareTo(element) > 0).count();
    }

    public T getMax(){
        return Collections.max(data);
    }

    public T getMin(){
        return Collections.min(data);
    }

    public int getSize(){
        return this.data.size();
    }

    public T getElement(int index){
        return data.get(index);
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//
//        data.forEach(e ->{
//            sb.append(e);
//            sb.append(System.lineSeparator());
//        });
//
//        return sb.toString().trim();
//    }

    public Iterator<T> iterator(){
        return new Iterator<T>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < data.size();
            }

            @Override
            public T next() {
                T element = data.get(index);
                index++;
                return element;
            }
        };
    }

}
