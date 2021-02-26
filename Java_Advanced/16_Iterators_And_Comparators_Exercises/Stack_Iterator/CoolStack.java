package Stack_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class CoolStack implements Iterable<Integer> {
    private List<Integer> stack;
    private int size = 0;
    private int index = -1;

    public CoolStack() {
        this.stack = new ArrayList<>();
    }

    public void push(int e){
        size++;
        index++;
        stack.add(e);
    }

    public int pop(){
        if(size == 0){
            System.out.println("No elements");
        }else {
            size--;
            index--;
            return stack.remove(stack.size() - 1);
        }
        return 0;
    }

    @Override
    public Iterator<Integer> iterator(){
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                if(index >= 0){
                    return true;
                }else {
                    index = size - 1;
                    return false;
                }
            }

            @Override
            public Integer next() {
                return stack.get(index--);
            }
        };
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {

    }

    @Override
    public Spliterator<Integer> spliterator() {
        return null;
    }
}
