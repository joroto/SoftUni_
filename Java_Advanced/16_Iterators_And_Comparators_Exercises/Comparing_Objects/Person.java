package Comparing_Objects;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    @Override
    public int compareTo(Person o) {
        int n = name.compareTo(o.name);
        if(n == 0){
            n = Integer.compare(age, o.age);
            if(n == 0){
                n = town.compareTo(o.town);
            }
        }
        return n;
    }
}
