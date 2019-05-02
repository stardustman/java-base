package generic.method;

import java.util.ArrayList;

public class GenericMethod <T>{
	
		//	�������еľ�̬������ʹ�÷��Ͳ�����ʱ�������˱��������Ϊһ����̬��������ʹ�÷Ǿ�̬����T,���T�Ƿ����ඨ��Ĳ�������
		//	����������ԭ�ģ�Cannot make a static reference to the non-static type T
			/*public static void printClassName(T t) {
				System.out.println(t.getClass().getName());
			}
	*/
	//���巺�ͷ���ʹ���еľ�̬��������ʹ�÷��Ͳ���
	public static <T> void printClassName(T t) {
		System.out.println(t.getClass().getName());
	}
	
	public static void main(String[] args) {

		GenericMethod.printClassName(1.0f);
		GenericMethod.printClassName(1);
		GenericMethod.printClassName("I'm String");
		GenericMethod.printClassName(new ArrayList<String>());
	}
}