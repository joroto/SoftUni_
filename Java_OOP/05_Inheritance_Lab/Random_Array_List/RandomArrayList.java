package Random_Array_List;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList <T> extends ArrayList<T> {
    private Random random;

    public RandomArrayList() {
        this.random = new Random();
    }

    public T getRandomElement(){
        int index = this.random.nextInt(15);
        return super.remove(index);
    }
}
