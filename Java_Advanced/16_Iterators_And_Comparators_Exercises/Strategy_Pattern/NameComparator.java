package Strategy_Pattern;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        int res = Integer.compare(p1.getName().length(), p2.getName().length());
        if(res == 0){
            res = p1.getName().compareTo(p2.getName());
        }
        return res;
    }
}
