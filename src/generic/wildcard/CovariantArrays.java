package generic.wildcard;

import generic.Apple;
import generic.Fruit;
import generic.FujiApple;
import generic.Orange;

public class CovariantArrays {

	public static void main(String[] args) {
		//����һ��Fruit[]���Խ�Apple[]����Fruit[]�ģ������Э���Ӧ��
		Fruit[] fruits = new Apple[10];
		fruits[0] = new Apple();
		fruits[1] = new FujiApple();
		fruits[3] = new Fruit();
		fruits[4] = new Orange();
	}

}