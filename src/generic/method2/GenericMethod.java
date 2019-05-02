package generic.method2;

import java.util.ArrayList;

public class GenericMethod {

	public static <T> void printClassName(T t) {
		System.out.println(t.getClass().getName());
	}

	public static void main(String[] args) {

		GenericMethod.printClassName(1.0f);
		GenericMethod.printClassName(1);
		GenericMethod.printClassName("I'm String");
		GenericMethod.printClassName(new ArrayList<String>());
	}
}