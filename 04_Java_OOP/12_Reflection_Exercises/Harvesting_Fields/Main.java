package Harvesting_Fields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String input;
		while (!(input = scan.nextLine()).equals("HARVEST")){

			Field[] fields = RichSoilLand.class.getDeclaredFields();
			String finalInput1 = input;

			if(input.equals("all")){
				Arrays.stream(fields).forEach(Main::print);
			}else {
				Arrays.stream(fields).filter(f -> (Modifier.toString(f.getModifiers())).equals(finalInput1))
						.forEach(Main::print);
			}
		}
	}
	private static String print(Field field){
		System.out.println(Modifier.toString(field.getModifiers()) + " "+field.getType().getSimpleName() + " " + field.getName());
		return field.toString();
	}
}
