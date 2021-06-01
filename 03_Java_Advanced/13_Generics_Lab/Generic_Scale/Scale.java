package Generic_Scale;

public class Scale<T> {
    T left;
    T right;

    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }
    interface Comparable<T> {
        int compareTo(T o);
    }

    public static <T extends Comparable<? super T>> T getHeavier(T obj1, T obj2) {
        //assert obj1.compareTo(obj2) < 0;

        if (obj1.compareTo(obj2) < 0){
            return obj2;
        }else if (obj1.compareTo(obj2) == 0){
            return null;
        }else {
            return obj1;
        }
        // FIXME: 2/20/2021 
    }
}
