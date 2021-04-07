package barracksWars.core.commands;

import barracksWars.interfaces.Executable;
import barracksWars.interfaces.Repository;

public class Retire implements Executable {
    private Repository repository;
    private String[] data;

    public Retire(){

    }

    public Retire(String[] data, Repository repository) {
        this.data = data;
        this.repository = repository;
    }

    @Override
    public String execute(){
        String unitType = this.data[1];
        this.repository.removeUnit(this.data[1]);
        return unitType + " retired!";
    }
}
