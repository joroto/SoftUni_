package Generic_Box;

public class Box <T>{
    T value;

    public Box(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.getClass().getName() +
                ": " + value;
    }
}
