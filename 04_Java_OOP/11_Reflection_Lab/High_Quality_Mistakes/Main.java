package High_Quality_Mistakes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Field[] fields = Reflection.class.getDeclaredFields();

        Arrays.stream(fields).filter(f -> !Modifier.isPrivate(f.getModifiers())).
                sorted(Comparator.comparing(Field::getName)).
                forEach(e -> System.out.println(e.getName() + " must be private!"));

        Method[] methods = Reflection.class.getDeclaredMethods();

        Arrays.stream(methods)
                .filter(f -> !Modifier.isPublic(f.getModifiers()) && f.getName().startsWith("get"))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(e -> System.out.println(e.getName() + " have to be public!"));

        Arrays.stream(methods)
                .filter(f -> !Modifier.isPrivate(f.getModifiers()) && f.getName().startsWith("set"))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(e -> System.out.println(e.getName() + " have to be private!"));
    }
}
