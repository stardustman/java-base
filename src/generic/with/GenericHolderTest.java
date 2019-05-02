package generic.with;

import generic.Apple;

public class GenericHolderTest {

	public static void main(String[] args) {

		//ͨ��GenericHolder<Apple>�����������������ΪApple,֮����������ʹ�����ȡ�����ݵļ��ͨͨ����������
		GenericHolder<Apple> holder = new GenericHolder<Apple>();
		holder.setT(new Apple());
		// ������󣬱�����������Ƿ���������Ԫ���Ƿ����㷺���������������
		// ����������ԭ�ģ�The method setT(Apple) in the type GenericHolder<Apple> is not applicable for the arguments (Orange)
		// holder.setT(new Orange());
		
		//������Ϊ��������ȡ����Ԫ�ؽ����Զ�ת��
		Apple apple = holder.getT();
		apple.functionInApple();
		
		//������󣺱���������ȡ�������Ͳ��ܰ�ȫ��ת��ΪOrange
		//Type mismatch: cannot convert from Apple to Orange
		//Orange orange = holder.getT();
	}

}