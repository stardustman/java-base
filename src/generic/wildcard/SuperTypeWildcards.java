package generic.wildcard;

import java.util.ArrayList;
import java.util.List;

import generic.Apple;
import generic.Fruit;
import generic.FujiApple;
import generic.Orange;
/**
 * ��ӣ��������Fruit��Fruit���������������
 * ���ǿ������Ϊ<? super Fruit>��һ��ĳ�����͵�SomeObject��
 * ���ǵļ̳й�ϵ�� Fruit extends SomeObject, SomeObject extends Object��

        ��ȡ����������ȡ����Ԫ��ֻ�ܰ�ȫת��ΪObject.(SomeObject extends Object)
        ��Ҳ����2&4&5�Ƶ������ġ���Ϊ���SomeObject��Fruit�ĳ��࣬��ô����ת��Ϊ�κ�Fruit��Fruit�����඼�޷�����֪ʶ��5��
        ��ֻ��ת��ΪObject��
 * @author young
 *
 */
public class SuperTypeWildcards {

	public static void write(List<? super Fruit> fruits) {
		// ? is super of Fruit,and ? extends of Object
		//compile error: The method add(? super Fruit) in the type List<? super Fruit> is not applicable for the arguments (Object)
		//fruits.add(new Object());
		//���Գɹ������Fruit��Fruit������
		fruits.add(new Fruit());
		fruits.add(new Apple());
		fruits.add(new Orange());
		fruits.add(new FujiApple());
        //�޷���ȫ��ת��Ϊ��Object֮����κ�����
		//T����������ԭ�ģ�cannot convert from capture#5-of ? super Fruit to Fruit
		//Fruit fruit =  fruits.get(0);
		
		//ǿ��ת��
		Fruit fruit = (Fruit) fruits.get(0);
		System.out.println("ǿ��ת��ΪFruit: " + fruit);
		//ֻ�ܰ�ȫ��ת��ΪObject
		Object object = fruits.get(0);
		System.out.println("��ǿ��ת��:" + object);
		System.out.println(object instanceof Fruit);
		System.out.println(object instanceof Orange);
	}
	
	public static void main(String[] args) {
		SuperTypeWildcards.write(new ArrayList<>());
	}
}