package Stack_Of_Strings;

import java.util.ArrayList;
import java.util.List;

public class StackOfStrings {
    private List<String> data = new ArrayList<>();

    public void push(String item){
        data.add(item);
    }

    public String pop(){
        return data.remove(data.size() - 1);
    }

    public String peek(){
        return data.get(data.size() - 1);
    }

    public boolean isEmpty(){
        return data.size() == 0;
    }
}
