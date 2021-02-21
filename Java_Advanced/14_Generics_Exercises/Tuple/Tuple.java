package Tuple;

public class Tuple <F, S>{
    private F item1;
    private S item2;

    public Tuple(F item1, S item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    @Override
    public String toString() {
        return item1 + " -> " + item2;
    }
}
