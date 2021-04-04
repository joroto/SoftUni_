package Black_Box_Integer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Scanner scan = new Scanner(System.in);

        Constructor<BlackBoxInt> constructor = BlackBoxInt.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        BlackBoxInt blackBoxInt = constructor.newInstance();


        String input;
        while (!(input = scan.nextLine()).equals("END")) {
            String[] inputArr = input.split("_");
            String command = inputArr[0];
            int param = Integer.parseInt(inputArr[1]);

            Method[] declaredMethods = blackBoxInt.getClass().getDeclaredMethods();
            Field innerValue = BlackBoxInt.class.getDeclaredField("innerValue");
            innerValue.setAccessible(true);

//            Method method = Arrays.stream(declaredMethods)
//                    .filter(m -> m.getName().equals(command))
//                    .findFirst().get();
            Method method = BlackBoxInt.class.getDeclaredMethod(command, int.class);

            method.setAccessible(true);
            method.invoke(blackBoxInt, param);

            System.out.println(innerValue.getInt(blackBoxInt));
        }

    }
}
