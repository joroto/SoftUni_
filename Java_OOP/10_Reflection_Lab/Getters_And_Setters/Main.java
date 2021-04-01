package Getters_And_Setters;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Method[] methods = Reflection.class.getDeclaredMethods();

        Method[] getters = Arrays.stream(methods).
                filter(m -> m.getName().startsWith("get") &&
                        m.getParameterCount() == 0).
                sorted(Comparator.comparing(Method::getName)).
                toArray(Method[]::new);


        Method[] setters = Arrays.stream(methods).
                filter(m -> m.getName().startsWith("set")).
                sorted(Comparator.comparing(Method::getName)).
                toArray(Method[]::new);

        Arrays.stream(getters).forEach(g -> System.out.printf("%s will return class %s\n"
                ,g.getName (), g.getReturnType ().toString ().replace ("class ","")));

        Arrays.stream(setters).forEach(e -> System.out.printf("%s and will set field of class %s\n",
                e.getName (), e.getParameterTypes ()[0].toString ().replace ("class ","")));
    }
}
