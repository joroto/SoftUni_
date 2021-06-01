package Custom_List_Sorter;

public class Sorter {
    public static <T extends Comparable<T>> void sort(CoolList<T> coolList){
        for (int i = 0; i <coolList.getSize(); i++) {
            T current = coolList.getElement(i);
            for (int j = i + 1; j < coolList.getSize(); j++) {
                T next = coolList.getElement(j);
                if(current.compareTo(next) > 0){
                    coolList.swap(i, j);
                }
            }
        }
    }
}
