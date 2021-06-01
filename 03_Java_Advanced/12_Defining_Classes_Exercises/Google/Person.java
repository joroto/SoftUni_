package Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Car car;
    private Company company;
    private List<Parent> parents;
    private List<Child> children;
    private List<Pokemon> pokemons;

    public Person(String name) {
        this.name = name;
        this.car = new Car(null, -1);
        this.company = new Company();
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
        this.pokemons = new ArrayList<>();
    }

    public Car getCar() {
        return car;
    }

    public Company getCompany() {
        return company;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public List<Child> getChildren() {
        return children;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}
