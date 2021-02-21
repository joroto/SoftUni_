package List_Utilities;

import java.util.*;

import static java.util.Collections.max;

public class ListUtils <T> {
    private static Comparator<Object> Comparators;

    public static <T extends Comparable<? super T>> T getMin(List<? extends T> coll) {
        return Collections.min(coll, Comparator.<T>naturalOrder());
    }

    public static <T extends Comparable<? super T>> T getMax(List<? extends T> coll) {
        return max(coll, Comparator.<T> naturalOrder());
    }

}


