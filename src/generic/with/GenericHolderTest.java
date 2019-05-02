package generic.with;

import generic.Apple;

public class GenericHolderTest {

	public static void main(String[] args) {

		//通过GenericHolder<Apple>定义容器处理的类型为Apple,之后放入容器和从容器取出数据的检查通通交给编译器
		GenericHolder<Apple> holder = new GenericHolder<Apple>();
		holder.setT(new Apple());
		// 编译错误，编译器检查我们放入容器的元素是否满足泛型容器定义的期许
		// 编译器报错原文：The method setT(Apple) in the type GenericHolder<Apple> is not applicable for the arguments (Orange)
		// holder.setT(new Orange());
		
		//编译器为从容器中取出的元素进行自动转型
		Apple apple = holder.getT();
		apple.functionInApple();
		
		//编译错误：编译器检查出取出的类型不能安全的转型为Orange
		//Type mismatch: cannot convert from Apple to Orange
		//Orange orange = holder.getT();
	}

}