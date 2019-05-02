package generic.wildcard;

import generic.Apple;
import generic.Fruit;
import generic.with.GenericHolder;

public class ConvarianGenericHolder {

	public static void main(String[] args) {

		// 编译错误：编译器不会认为GenericHolder<Apple>是GenericHolder<Fruit>的子类
		// 编译器报错原文：Type mismatch: cannot convert from GenericHolder<Apple> to GenericHolder<Fruit> GenericHolder<Fruit> fruitsHolder = new GenericHolder<Apple>();
       	//使用上边界通配符实现Java泛型容器的协变
		//GenericHolder< Fruit> fruitsHolder = new GenericHolder<Apple>();
		
		GenericHolder<? extends Fruit> fruitsHolder = new GenericHolder<Apple>();
		//The method setT(capture#1-of ? extends Fruit) in the type GenericHolder<capture#1-of ? extends Fruit> 
		//is not applicable for the arguments (Apple)
		//fruitsHolder.setT(new Apple());
		
		fruitsHolder.setT(null);
		System.out.println(fruitsHolder);

	}

}