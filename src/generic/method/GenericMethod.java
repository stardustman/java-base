package generic.method;

import java.util.ArrayList;

public class GenericMethod <T>{
	
		//	泛型类中的静态方法在使用泛型参数的时候遇到了编译错误因为一个静态方法不能使用非静态引用T,这个T是泛型类定义的参数类型
		//	编译器报错原文：Cannot make a static reference to the non-static type T
			/*public static void printClassName(T t) {
				System.out.println(t.getClass().getName());
			}
	*/
	//定义泛型方法使类中的静态方法可以使用泛型参数
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