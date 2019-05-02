package generic.wildcard;

import java.util.ArrayList;
import java.util.List;

import generic.Apple;
import generic.Fruit;

/**
 * 添加：不能添加除null之外的任何元素进入容器。
 * 由知识点1知道List<? extends Fruit>是一个Fruit子类的具体类型。
 * 既然List<? extends Fruit>是一个具体类型，那么可以理解为<? extends Fruit>为一个不知道名字的具体的水果(unknowNameFruit)。
 * 可以理解为List<UnknowNameFruit>
 * 向一个List<Apple>的list可以添加Apple，以及Apple的子类FujiApple,不能添加Orange元素。
 * 类推出List<UnknowNameFruit>只能添加List<UnknownNameFruit>以及null(null是任何类的子类).

读取：可以从容器中安全的读取Fruit和Fruit的子类并安全的转型为Fruit。由5可知向上转型是安全的，所以这个unknowNameFruit可以安全的从容器中取出并转型为Fruit。
 * @author young
 *
 */
public class ExtendTypeWildcards {

	public static void main(String[] args) {
		List<? extends Fruit> fruits = new ArrayList<Apple>();
		// ? is extends of Fruit,and null extends of ?. only null can be added.
		// 编译错误：这样的行为你可以理解为向一个List<unknowNameFruit>里添加Apple元素会失败一样，就像
		//我们向List<orange>的list中添加Apple会失败一样
		// 编译器报错原文：The method add(? extends Fruit) in the type ? extends Fruit> is not applicable for the arguments (Apple)
		//fruits.add(new Fruit());
		//fruits.add(new Apple());
		//fruits.add(new Orange());
		//fruits.add(new FujiApple());
		fruits.add(null);
		//从容器中取出unknowNameFruit并安全转型为Fruit
		Fruit fruit = fruits.get(0);
		System.out.println(fruit);
	}

}