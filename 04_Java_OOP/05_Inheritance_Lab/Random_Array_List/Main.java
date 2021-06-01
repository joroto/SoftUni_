package Random_Array_List;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        RandomArrayList<Integer> list1 = new RandomArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            list1.add(i + random.nextInt());
        }
        System.out.println(list1.getRandomElement());
    }
}
