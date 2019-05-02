package generic.method.wrong;

public class GenericMethod {
	public static void printClassName(T t) {
					System.out.println(t.getClass().getName());
				}
	
	public static void main(String[] args) {
		GenericMethod.printClassName("1");
	}
}

