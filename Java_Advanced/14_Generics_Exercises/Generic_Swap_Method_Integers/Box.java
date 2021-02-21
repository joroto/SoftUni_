package Generic_Swap_Method_Integers;

import java.util.List;

public class Box<T> {
    private List<T> values;

    public Box(List<T> values) {
        this.values = values;
    }

    public void swap(int index1, int index2){
        T temp = this.values.get (index1);
        this.values.set (index1, this.values.get(index2));
        this.values.set (index2, temp);
    }

    @Override
    public
    String toString () {
        StringBuilder sb = new StringBuilder ();
        for (T value : values) {
            sb.append (String.format ("%s: %s\n", value.getClass ().getName (),value));
        }
        return sb.toString ();
    }
}
