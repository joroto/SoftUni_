package barracksWars.core.commands;

import barracksWars.interfaces.Executable;
import barracksWars.interfaces.Repository;
import jdk.jshell.spi.ExecutionControl;

public class Report implements Executable {
    private Repository repository;

    public Report(){

    }

    public Report(Repository repository) {
        this.repository = repository;
    }

    @Override
    public String execute() throws ExecutionControl.NotImplementedException {
        return repository.getStatistics();
    }
}
