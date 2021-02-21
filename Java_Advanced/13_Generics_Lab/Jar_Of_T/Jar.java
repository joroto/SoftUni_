package Jar_Of_T;

import java.util.ArrayDeque;

public class Jar <T>{
    private ArrayDeque<T> data;

    public Jar() {
        this.data = new ArrayDeque<>();
    }

    public void add(T element){
        this.data.push(element);
    }

    public T remove(){
        return this.data.pop();
    }
}

