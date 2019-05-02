package generic.wildcard;

import java.util.List;

/**
�޽�ͨ�������������ͳ��͸���ͨ����Ĳ�����
��ӣ�ͬ����ͨ���һ����������ӳ�null֮����κ�Ԫ�ؽ���������
��ȡ��ͬ����ͨ���һ������������ȡ����Ԫ��ֻ�ܰ�ȫת��ΪObject.
 * @author young
 *
 */
public class Wildcards {

	public void unboundArgsForList(List<?> list) {

		// ��������޷�������������κγ�null���Ԫ��
		// ����������ԭ�ģ�The method add(capture#4-of ?) in the type List<capture#4-of ?> is not applicable for the arguments (Fruit)
		//list.add(new Fruit());
		//list.add(new Apple());

		list.add(null);

		// ������󣺴�������ȡ����Ԫ��ֻ�ܰ�ȫת��ΪObject
		// ����������ԭ�ģ�Type mismatch: cannot convert from capture#5-of ? to Apple
		//Apple apple = list.get(0);
		
		Object obj = list.get(0);
		System.out.println(obj);

	}
}