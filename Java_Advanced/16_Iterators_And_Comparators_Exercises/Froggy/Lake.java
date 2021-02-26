package Froggy;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Lake implements Iterable<Integer>{
    private int[] numbers;

    public Lake(int[] numbers){
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int index;
            final int lastEven = numbers.length % 2 == 0
                    ? numbers.length - 2
                    : numbers.length - 1;
            @Override
            public boolean hasNext() {
                return index < numbers.length;
            }

            @Override
            public Integer next() {
                if(index == lastEven){
                    index = 1;
                    return numbers[lastEven];
                }
                int copy = index;
                index += 2;
                return numbers[copy];
            }
        };
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
}
