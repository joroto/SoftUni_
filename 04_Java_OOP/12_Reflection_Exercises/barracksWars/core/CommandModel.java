package barracksWars.core;

import barracksWars.interfaces.CommandInterpreter;
import barracksWars.interfaces.Executable;
import barracksWars.interfaces.Repository;
import barracksWars.interfaces.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class CommandModel implements CommandInterpreter {
    private Repository repository;
    private UnitFactory factory;

    public CommandModel(Repository repository, UnitFactory factory) {
        this.repository = repository;
        this.factory = factory;
    }

    @Override
    public Executable interpretCommand(String[] data, String commandName) {
        Executable executable;

        commandName = Character.toUpperCase(commandName.charAt(0)) + commandName.substring(1);

        try {
            Class<? extends Executable> clazz =
                    (Class<? extends Executable>) Class.forName("barracksWars.core.commands."
                            + commandName);
            Constructor<? extends Executable> ctor = clazz.getDeclaredConstructor();
            executable = ctor.newInstance();

            injectFields(executable, data);
        }catch (Exception e){
            throw new IllegalStateException(e);
        }

        return executable;
    }

    private void injectFields(Executable executable, String[] data) {
        try {
            Field[] declaredFields = executable.getClass().getDeclaredFields();

            for (Field declaredField : declaredFields) {
                declaredField.setAccessible(true);
                if (declaredField.getType() == String[].class) {
                    declaredField.set(executable, data);
                }else if(declaredField.getType() == Repository.class){
                    declaredField.set(executable, this.repository);
                }else if(declaredField.getType() == UnitFactory.class){
                    declaredField.set(executable, this.factory);
                }
            }
        }catch (Exception ignored){
        }
    }
}
