package generic.wildcard;

import generic.Apple;
import generic.Fruit;
import generic.with.GenericHolder;

public class ConvarianGenericHolder {

	public static void main(String[] args) {

		// ������󣺱�����������ΪGenericHolder<Apple>��GenericHolder<Fruit>������
		// ����������ԭ�ģ�Type mismatch: cannot convert from GenericHolder<Apple> to GenericHolder<Fruit> GenericHolder<Fruit> fruitsHolder = new GenericHolder<Apple>();
       	//ʹ���ϱ߽�ͨ���ʵ��Java����������Э��
		//GenericHolder< Fruit> fruitsHolder = new GenericHolder<Apple>();
		
		GenericHolder<? extends Fruit> fruitsHolder = new GenericHolder<Apple>();
		//The method setT(capture#1-of ? extends Fruit) in the type GenericHolder<capture#1-of ? extends Fruit> 
		//is not applicable for the arguments (Apple)
		//fruitsHolder.setT(new Apple());
		
		fruitsHolder.setT(null);
		System.out.println(fruitsHolder);

	}

}