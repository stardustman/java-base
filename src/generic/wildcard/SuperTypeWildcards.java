package generic.wildcard;

import java.util.ArrayList;
import java.util.List;

import generic.Apple;
import generic.Fruit;
import generic.FujiApple;
import generic.Orange;
/**
 * 添加：可以添加Fruit和Fruit的子类进入容器。
 * 我们可以理解为<? super Fruit>是一个某中类型的SomeObject，
 * 他们的继承关系是 Fruit extends SomeObject, SomeObject extends Object。

        读取：从容器中取出的元素只能安全转型为Object.(SomeObject extends Object)
        这也是由2&4&5推导出来的。因为这个SomeObject是Fruit的超类，那么将他转型为任何Fruit和Fruit的子类都无法满足知识点5，
        故只能转型为Object。
 * @author young
 *
 */
public class SuperTypeWildcards {

	public static void write(List<? super Fruit> fruits) {
		// ? is super of Fruit,and ? extends of Object
		//compile error: The method add(? super Fruit) in the type List<? super Fruit> is not applicable for the arguments (Object)
		//fruits.add(new Object());
		//可以成功的添加Fruit和Fruit的子类
		fruits.add(new Fruit());
		fruits.add(new Apple());
		fruits.add(new Orange());
		fruits.add(new FujiApple());
        //无法安全的转型为除Object之外的任何类型
		//T编译器报错原文：cannot convert from capture#5-of ? super Fruit to Fruit
		//Fruit fruit =  fruits.get(0);
		
		//强制转换
		Fruit fruit = (Fruit) fruits.get(0);
		System.out.println("强制转换为Fruit: " + fruit);
		//只能安全的转型为Object
		Object object = fruits.get(0);
		System.out.println("不强制转换:" + object);
		System.out.println(object instanceof Fruit);
		System.out.println(object instanceof Orange);
	}
	
	public static void main(String[] args) {
		SuperTypeWildcards.write(new ArrayList<>());
	}
}