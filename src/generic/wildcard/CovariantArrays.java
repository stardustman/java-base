package generic.wildcard;

import generic.Apple;
import generic.Fruit;
import generic.FujiApple;
import generic.Orange;

public class CovariantArrays {

	public static void main(String[] args) {
		//定义一个Fruit[]可以将Apple[]赋给Fruit[]的，这就是协变的应用
		Fruit[] fruits = new Apple[10];
		fruits[0] = new Apple();
		fruits[1] = new FujiApple();
		fruits[3] = new Fruit();
		fruits[4] = new Orange();
	}

}