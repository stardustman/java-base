package generic.wildcard;

import java.util.List;

/**
无界通配符的限制是类统配和父类通配符的并集。
添加：同子类通配符一样。不能添加除null之外的任何元素进入容器。
读取：同父类通配符一样。从容器中取出的元素只能安全转型为Object.
 * @author young
 *
 */
public class Wildcards {

	public void unboundArgsForList(List<?> list) {

		// 编译错误：无法向容器中添加任何除null外的元素
		// 编译器报错原文：The method add(capture#4-of ?) in the type List<capture#4-of ?> is not applicable for the arguments (Fruit)
		//list.add(new Fruit());
		//list.add(new Apple());

		list.add(null);

		// 编译错误：从容器中取出的元素只能安全转型为Object
		// 编译器报错原文：Type mismatch: cannot convert from capture#5-of ? to Apple
		//Apple apple = list.get(0);
		
		Object obj = list.get(0);
		System.out.println(obj);

	}
}