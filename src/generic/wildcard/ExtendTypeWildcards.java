package generic.wildcard;

import java.util.ArrayList;
import java.util.List;

import generic.Apple;
import generic.Fruit;

/**
 * ��ӣ�������ӳ�null֮����κ�Ԫ�ؽ���������
 * ��֪ʶ��1֪��List<? extends Fruit>��һ��Fruit����ľ������͡�
 * ��ȻList<? extends Fruit>��һ���������ͣ���ô�������Ϊ<? extends Fruit>Ϊһ����֪�����ֵľ����ˮ��(unknowNameFruit)��
 * �������ΪList<UnknowNameFruit>
 * ��һ��List<Apple>��list�������Apple���Լ�Apple������FujiApple,�������OrangeԪ�ء�
 * ���Ƴ�List<UnknowNameFruit>ֻ�����List<UnknownNameFruit>�Լ�null(null���κ��������).

��ȡ�����Դ������а�ȫ�Ķ�ȡFruit��Fruit�����ಢ��ȫ��ת��ΪFruit����5��֪����ת���ǰ�ȫ�ģ��������unknowNameFruit���԰�ȫ�Ĵ�������ȡ����ת��ΪFruit��
 * @author young
 *
 */
public class ExtendTypeWildcards {

	public static void main(String[] args) {
		List<? extends Fruit> fruits = new ArrayList<Apple>();
		// ? is extends of Fruit,and null extends of ?. only null can be added.
		// ���������������Ϊ��������Ϊ��һ��List<unknowNameFruit>�����AppleԪ�ػ�ʧ��һ��������
		//������List<orange>��list�����Apple��ʧ��һ��
		// ����������ԭ�ģ�The method add(? extends Fruit) in the type ? extends Fruit> is not applicable for the arguments (Apple)
		//fruits.add(new Fruit());
		//fruits.add(new Apple());
		//fruits.add(new Orange());
		//fruits.add(new FujiApple());
		fruits.add(null);
		//��������ȡ��unknowNameFruit����ȫת��ΪFruit
		Fruit fruit = fruits.get(0);
		System.out.println(fruit);
	}

}