package generic.without;

import generic.Apple;


public class ObjectHolderTest {

	public static void main(String[] args) {

		ObjectHolder holder = new ObjectHolder();
		
		// ��Ҫ�����Ҫ�������з���ʲôԪ��
		// ��holder�����з���Apple
		holder.setObject(new Apple());
		
		// ��Ҫ�Դ�������ȡ����Ԫ�ؽ����ֶ�����ת��
		// ����֪�������з������Apple,�ó������еĶ��󣬽���ת��ΪApple
		Apple apple = (Apple) holder.getObject();
		apple.functionInApple();
		
		// ��Ҫ�Դ�������ȡ����Ԫ�ؽ���ת�ͣ����ǿ��ܻ���Ϊ������ת�ʹ���
		// ������Ϊ���holder�����зŵ���Orange,������³������г����쳣
		//generic.Apple cannot be cast to generic.Orange
		//Orange orange = (Orange) holder.getObject();
		//orange.functionInOrange();
	}

}